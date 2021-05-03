

/*
    Running the Application via this class will run the program in GUI MODE.
    All user-input and program output will be done via a Window.
*/
public class Main
{
    // The Application that holds Simulation status.
    static private final GUI mainWindow = new GUI();
    static private WelcomeScreen welScr;
    
    // The Main Method from which the Program can be started from.
    public static void main(String[] args)
    {
        int selectedGrdlvl;
        boolean startMain;
        welScr = new WelcomeScreen(mainWindow, true);
        welScr.setVisible(true);
        selectedGrdlvl = welScr.getGrade();
        startMain = welScr.getComplete();
        
        if(startMain){
            mainWindow.setVisible(true);
            if(selectedGrdlvl <= 2){
                K2OptionMenu opt = new K2OptionMenu(mainWindow,false);
                opt.setLocation(mainWindow.getX() + mainWindow.getWidth(), mainWindow.getY());
                opt.setVisible(true);
                mainWindow.setGrdLvl(selectedGrdlvl);
                mainWindow.setParams(opt);
            } else if(selectedGrdlvl > 2 && selectedGrdlvl <= 5){
                OptionMenu opt = new OptionMenu(mainWindow,false);
                opt.setLocation(mainWindow.getX() + mainWindow.getWidth(), mainWindow.getY());
                opt.setVisible(true);
                mainWindow.setGrdLvl(selectedGrdlvl);
                mainWindow.setParams(opt);
            } else if(selectedGrdlvl > 5){
                G68OptionMenu opt = new G68OptionMenu(mainWindow,false);
                opt.setLocation(mainWindow.getX() + mainWindow.getWidth(), mainWindow.getY());
                opt.setVisible(true);
                mainWindow.setGrdLvl(selectedGrdlvl);
                mainWindow.setParams(opt);
            }
        }
        System.out.println("Now running the Application in GUI MODE...\n");
    }
    public static void callMain(){
        String[] my = {""};
        main(my);
    }
}