


import java.util.ArrayList;
/*
    The class that holds the state of the application.
    It is intended to be controlled through function calls by a Driver Class.
    Said Driver Class will additionally implement any necessary I/O.
*/
public class Application
{
    private Woods woods;
    private ArrayList<Person> people;
    private int numUpdates; 

    // Default Constructor
    public Application()
    {
        woods = new Woods(0, 0);
        people = new ArrayList<>();
        numUpdates = 0;
    }

    // Prepares the Application to run a new simulation.
    public void reset(Woods newWoods, ArrayList<Person> newPeople)
    {
        woods = newWoods;
        people = newPeople;
        numUpdates = 0;
    }

    // Advances the state of the simulation by moving all the people.
    public void update()
    {
        if (isFinished()) return;
        
        // Update all the Leaders.
        for (int i = 0; i < people.size(); ++i)
        {
            Person p = people.get(i);
            ArrayList<Person> tilePeople = getPeople(p.position);
            p.leader = tilePeople.get(0);
        }

        // Move all the People.
        for (int i = 0; i < people.size(); ++i)
        {
            Vec2D nextPos = people.get(i).nextPosition();
            if (woods.isInbounds(nextPos))
            {
                people.get(i).moveTo(nextPos);
                //System.out.println(people.get(i) + " p#: " + i); //for testing.
            }
        }

        ++numUpdates;
    }

    // Returns True once all people have reached the same coordinate.
    public boolean isFinished()
    {
        for (int i = 0; i < people.size() - 1; ++i)
        {
            if (!(people.get(i).position.equals(people.get(i+1).position))) return false;
        }
        return true;
    }

    // Returns the number of updates that the simulation has run.
    public int getUpdates()
    {
        return numUpdates;
    }

    // Returns a list of people at the given position.
    private ArrayList<Person> getPeople(Vec2D pos)
    {
        ArrayList<Person> tilePeople = new ArrayList<>();
        
        for (int i = 0; i < people.size(); ++i)
        {
            Person p = people.get(i);
            if (p.position.equals(pos))
                tilePeople.add(p);
        }

        return tilePeople;
    }
    public ArrayList<Person> spectatorView(){
    	return this.people;
    }

}
