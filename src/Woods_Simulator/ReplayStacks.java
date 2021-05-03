

import java.awt.Image;
import java.util.ArrayList;
public class ReplayStacks{
    
    private ArrayList<Vec2D> Player1 = null;
    private ArrayList<Vec2D> Player2 = null;
    private ArrayList<Vec2D> Player3 = null;
    private ArrayList<Vec2D> Player4 = null;
    private Image char1, char2, char3, char4;


    public ReplayStacks(int players){
        switch(players){
            case 2:
                this.Player1 = new ArrayList<Vec2D>();
                this.Player2 = new ArrayList<Vec2D>();
                break;
            case 3:
                this.Player1 = new ArrayList<Vec2D>();
                this.Player2 = new ArrayList<Vec2D>();
                this.Player3 = new ArrayList<Vec2D>();
                break;
            case 4:
                this.Player1 = new ArrayList<Vec2D>();
                this.Player2 = new ArrayList<Vec2D>();
                this.Player3 = new ArrayList<Vec2D>();
                this.Player4 = new ArrayList<Vec2D>();
                break;
            default:
        }

    }
    public ReplayStacks(){
        Player1 = new ArrayList<Vec2D>();
        Player2 = new ArrayList<Vec2D>();
        Player3 = new ArrayList<Vec2D>();
        Player4 = new ArrayList<Vec2D>();
    }
    public ArrayList<Vec2D> givePlayerStack(int player){
        switch(player){
            case 1:
                return Player1;
            case 2:
                return Player2;
            case 3:
                return Player3;
            case 4:
                return Player4;
            default:
                return null;
        }
    }
    public void recordPlayer(Vec2D person, int player){
        switch(player){
            case 1:
                Player1.add(person);
                break;
            case 2:
                Player2.add(person);
                break;
            case 3:
                Player3.add(person);
                break;
            case 4:
                Player4.add(person);
                break;
            default:
                System.err.println("Error in ReplayStack.RecordPlayer; Default hit");
                break;
        }
    }
    public int returnStackCount(){
        int count = 0;
        if(Player1 != null){
            count++;
        } else if(Player2 != null){
            count++;
        } else if(Player3 != null){
            count++;
        } else if(Player4 != null){
            count++;
        } else {
            return count;
        }
        return count;
    }
    public boolean isEmpty(int player){
        switch(player){
            case 1:
                 return Player1.isEmpty();
            case 2:
                return Player2.isEmpty();
            case 3:
                return Player3.isEmpty();
            case 4:
                return Player4.isEmpty();
            default:
                System.err.println("Error in ReplayStack.isEmpty; Default hit");
                return false;
        }
    }
    public int size(int player){
        switch(player){
            case 1:
                 return Player1.size();
            case 2:
                return Player2.size();
            case 3:
                return Player3.size();
            case 4:
                return Player4.size();
            default:
                System.err.println("Error in ReplayStack.size; Default hit");
                return -1;
        }
    }
    public void setCharacter(int player, Image character) {
        switch(player){
        case 1:
             this.char1 = character;
             break;
        case 2:
            this.char2 = character;
            break;
        case 3:
            this.char3 = character;
            break;
        case 4:
            this.char4 = character;
            break;
        default:
            System.err.println("Error in ReplayStack.setCharacter; Default hit");
            break;
        }
    }
    public Image getCharacter(int player) {
        switch(player){
        case 1:
        	return char1;
        case 2:
        	return char2;
        case 3:
        	return char3;
        case 4:
        	return char4;
        default:
            System.err.println("Error in ReplayStack.setCharacter; Default hit");
            return null;
        }
    }

}
