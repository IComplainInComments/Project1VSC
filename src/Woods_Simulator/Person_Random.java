


/*
    This type of Person wanders by choosing a random non-neutral direction and walking 1 tile in that direction.
*/
public class Person_Random extends Person
{
    // Default Constructor
    public Person_Random()
    {
        super();
    }
    
    // Constructor
    public Person_Random(Woods woods, int x, int y)
    {
        super(woods, x, y);
    }

    @Override
    protected Vec2D nextPosition()
    {
        if (leader == this)
        {
            return position.add(newDirection());
        }
        else // Follow the leader.
        {
            return leader.position;
        }
    }

    // Returns a random directional offset.
    protected Vec2D newDirection()
    {
        int xOffset, yOffset;
            
        do // Generate a random X/Y Offset in the range [-1, 1], trying again if both are zero.
        {
            xOffset = randrangeInt(-1, 1);
            yOffset = randrangeInt(-1, 1);
        } while ((xOffset == 0) && (yOffset == 0));

        return new Vec2D(xOffset, yOffset);
    }

    // Returns a random integer within the range [min, max] inclusive.
    protected int randrangeInt(int min, int max)
    {
        return (int)(Math.random() * (max - min + 1)) + min;
    }

    public String toString(){
        return super.toString() + " -Random";
    }
}
