


/*
    This type of person chooses a random direction and walks that way until they hit a wall.
    Then, they "bounce" off that wall by choosing another random direction.
*/
public class Person_Bounce extends Person_Random
{
    // The Direction that the person will move in.
    protected Vec2D offsetDir;

    // Default Constructor
    public Person_Bounce()
    {
        super();
        offsetDir = null;
    }
    
    // Constructor
    public Person_Bounce(Woods woods, int x, int y)
    {
        super(woods, x, y);
        offsetDir = null;
    }

    @Override
    protected Vec2D nextPosition()
    {
        if (leader == this)
        {
            if (offsetDir == null)
                offsetDir = super.newDirection();

            Vec2D nextPos = position.add(offsetDir);
            if (!woodsRef.isInbounds(nextPos))
                offsetDir = super.newDirection();

            return nextPos;
        }
        else // Follow the leader.
        {
            return leader.position;
        }
    }

    public String toString(){
        return super.toString() + " -Bounce";
    }

}
