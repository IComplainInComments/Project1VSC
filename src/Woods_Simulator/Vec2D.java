


/*
    Convenience class for implementing anything with X & Y components (such as positions / offsets).
*/
public class Vec2D
{
    // Public Members that can be freely read/written by outside code.
    public int x;
    public int y;

    // Default Constructor
    public Vec2D()
    {
        this.x = 0;
        this.y = 0;
    }

    // Constructor
    public Vec2D(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    // Copy Constructor
    public Vec2D(Vec2D that)
    {
        this.x = that.x;
        this.y = that.y;
    }

    // Returns a New Vec2D whose X & Y components are the sum of the two Vec2Ds this and that.
    public Vec2D add(Vec2D that)
    {
        return new Vec2D(this.x + that.x, this.y + that.y);
    }


    // Determines if two Vec2Ds are equal by comparing their X & Y components.
    @Override
    public boolean equals(Object obj)
    {
        Vec2D that = (Vec2D)obj;
        return (this.x == that.x) && (this.y == that.y);
    }

    // Returns a String representation of the Vec2D.
    @Override
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
    public int getX() {
    	return this.x;
    }
    public int getY() {
    	return this.y;
    }

}
