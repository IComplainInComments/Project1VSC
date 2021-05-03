
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//comment
import java.util.ArrayList;

/**
 *
 * @author edward
 */
public class Core {

	private ArrayList<Person> thePlayers = null;
    private final Application app = new Application();
    private Statistics stat = new Statistics();
    private TextToSpeech ttsObj = new TextToSpeech();
    private AudioClipPlayer mainTheme;
    private AudioClipPlayer endSimTheme;
    private ReplayStacks stacks;
    private int Grade = 0;
    private int Players = 0;
    private int Width = 0;
    private int Length = 0;
    private int simRuns = 0;
    private WalkingProtocol wp= WalkingProtocol.WALK_RANDOM;

    public Core(K2OptionMenu params, int grade) {
        this.Grade = grade;
        this.Players = 2;
        this.Width = 2;
        this.Length = 2;
        this.simRuns = params.getTimes();
        this.stacks = new ReplayStacks(2);
    }

    public Core(OptionMenu params, int grade) {
        this.Grade = grade;
        this.Players = params.getPlayers();
        this.Width = params.getWid();
        this.Length = params.getLeng();
        this.simRuns = params.getTimes();
        this.stacks = new ReplayStacks(params.getPlayers());
    }

    public Core(G68OptionMenu params, int grade) {
        this.Grade = grade;
        this.Players = params.getPlayers();
        this.Width = params.getWid();
        this.Length = params.getLeng();
        this.simRuns = params.getTimes();
        this.wp = params.getSimMode();
        this.stacks = new ReplayStacks(params.getPlayers());
    }
    public Core(){
        this.Grade = 0;
        this.Players = 0;
        this.Width = 0;
        this.Length = 0;
        this.simRuns = 0;
        this.wp = WalkingProtocol.WALK_RANDOM;
        this.stacks = new ReplayStacks(4);
    }
    
    public void stop(){
        System.exit(0);
    }
    public void reset(){
        this.Players = 2;
        this.Width = 2;
        this.Length = 2;
        this.simRuns = 1;
        this.wp = WalkingProtocol.WALK_RANDOM;
    }
    public String valueOutput(){
        return "Players: "+this.Players+" Length: "+this.Length+" Width: "+this.Width+" Times to run: "+this.simRuns+" Run Mode: "+wp.toString();
    }

    public ReplayStacks startApp() {
        System.out.println(valueOutput());
        System.out.println("!!!!STARTAPPCALLED!!!!");
        GradeLevel grdlvl = GradeLevel.fromGradeInt(this.Grade);

        Woods woods;
        woods = new Woods(Width, Length);

        stat.clearStatistics();
        
        ArrayList<Person> people = createRoster(woods, grdlvl);
        this.thePlayers = people;

               
        ArrayList<Person> temppeople = cloneRoster(woods, people); //we need this copy of the original roster, for when we run the repeats... if we try to use people again,
        //it will end up asking the user to re-enter the number of players, and we want the configuration to be saved... we don't want to have the user have to re-enter anything.
    

        app.reset(woods, people);

        try {
        	String filePath_mainTheme = "src/Woods_Simulator/Audio_Assets/Theme_for_the_forest_game.wav";
            mainTheme = new AudioClipPlayer(filePath_mainTheme, true);
            mainTheme.play();
        
        	while (!app.isFinished()) {
        		app.update();
        		if(Players == 2) {
        			stacks.recordPlayer(people.get(0).position, 1);
        			stacks.recordPlayer(people.get(1).position, 2);
        		} else if(Players == 3) {
        			stacks.recordPlayer(people.get(0).position, 1);
        			stacks.recordPlayer(people.get(1).position, 2);
        			stacks.recordPlayer(people.get(2).position, 3);
        		} else if(Players == 4) {
        			stacks.recordPlayer(people.get(0).position, 1);
        			stacks.recordPlayer(people.get(1).position, 2);
        			stacks.recordPlayer(people.get(2).position, 3);
        			stacks.recordPlayer(people.get(3).position, 4);
        		}
        		this.thePlayers = app.spectatorView();
        	}
        	mainTheme.stop();
        }
        catch (Exception ex) 
        {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
        stat.updateStatistics(app);
        
        try {
            String filePath_endSimTheme = "src/Woods_Simulator/Audio_Assets/Forest_Victory_Theme.wav"; //too loud
            endSimTheme = new AudioClipPlayer(filePath_endSimTheme, false);
            endSimTheme.play();
        }
        catch (Exception ex) 
        {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
        
        System.out.println("\nThe simulation took " + app.getUpdates() + " steps!");


                
        for(int i = 0; i < 99; ++i){
            people = cloneRoster(woods, temppeople);
            app.reset(woods, people); //create the app again with the same statistics.
            while(!app.isFinished()){ //run this badboy again
                app.update();
                //no need to print this time
            }
            stat.updateStatistics(app);
        }
        


        System.out.println(stat.toString());

        ttsObj.speak(stat.toString());
        return stacks;
    }

    @SuppressWarnings("static-access")
	public ArrayList<Person> createRoster(Woods woods, GradeLevel grdlvl) {
    	//implement logic for letting people in grades 3-8 select where they want to place their characters, if they want... 
    	
    	//Without that logic, however, everything is super simple! 
    	//All that being said, wp and Players comes straight from the GUI, so... we really don't need to ask for it again. The gui handles all of that logic.
        
        ArrayList<Person> people = new ArrayList<>();
       
        if (Players >= 1) people.add(WalkingProtocol.generatePerson(wp, woods, woods.getTopLeft()));
        if (Players >= 2) people.add(WalkingProtocol.generatePerson(wp, woods, woods.getBottomRight()));
        if (Players >= 3) people.add(WalkingProtocol.generatePerson(wp, woods, woods.getBottomLeft()));
        if (Players >= 4) people.add(WalkingProtocol.generatePerson(wp, woods, woods.getTopRight()));

        
        return people;
    }
    public ArrayList<Person> spectator(){
    	return this.thePlayers;
    }

    public ArrayList<Person> cloneRoster(Woods woods, ArrayList<Person> people){
        ArrayList<Person> temp = new ArrayList<Person>();
        for(int i = 0; i < people.size(); ++i){
            temp.add(WalkingProtocol.generatePerson(wp, woods, people.get(i).getPosition()));
        }
        return temp;
    } 
}
