


import java.util.ArrayList;

/*
    This type of Person will only walk to adjacent tiles that they have never visited before.
    If there are no options, then they will walk randomly.
*/
public class Person_Unique extends Person_Random
{
    // Keeps track of whether not this person has visited a particular tile. (Coords are in [y][x] format)
    boolean[][] hasVisited;

    // Default Constructor
    public Person_Unique()
    {
        super();
        hasVisited = null;
    }
    
    // Constructor
    public Person_Unique(Woods woods, int x, int y)
    {
        super(woods, x, y);
        hasVisited = new boolean[woods.getHeight()][woods.getWidth()];
    }

    @Override
    protected Vec2D nextPosition()
    {
        if (leader == this)
        {
            ArrayList<Vec2D> adjacentTiles = new ArrayList<>();

            // Generate a list of all unvisited adjacent tiles.
            Vec2D pos = new Vec2D();
            for (pos.y = position.y - 1; pos.y <= position.y + 1; ++pos.y)
            {
                for (pos.x = position.x - 1; pos.x <= position.x + 1; ++pos.x)
                {
                    if (woodsRef.isInbounds(pos) && !hasVisited[pos.y][pos.x])
                        adjacentTiles.add(new Vec2D(pos));
                }    
            }

            // If there are any unvisited tiles, choose a random one, else move in a completely random direction.
            if (adjacentTiles.size() > 0)
                return adjacentTiles.get(randrangeInt(0, adjacentTiles.size() - 1));
            else
                return super.nextPosition();
        }
        else // Follow the leader.
        {
            return leader.position;
        }
    }

    @Override
    public void moveTo(Vec2D coord)
    {
        super.moveTo(coord);
        hasVisited[coord.y][coord.x] = true;
    }

    public String toString(){
        return super.toString() + " -Unique";
    }
}
