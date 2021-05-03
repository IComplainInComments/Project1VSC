


/*
    This class represents a Rectangular Grid of tiles.
*/
public class Woods
{
    // The Width and Height of the grid representing the Woods.
    private int width;
    private int height;

    static public int MAX_WIDTH = 20;
    static public int MAX_HEIGHT = 20;

    // Constructor
    public Woods(int w, int h)
    {
        width = w;
        height = h;
    }

    // Returns True if a Coordinate is within the bounds of the grid, or False otherwise.
    public boolean isInbounds(Vec2D coord)
    {
        return (coord.x >= 0) && (coord.x < width) && (coord.y >= 0) && (coord.y < height);
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public Vec2D getTopLeft(){
        return new Vec2D(0, 0);
    }

    public Vec2D getTopRight(){
        return new Vec2D(width - 1, 0);
    }

    public Vec2D getBottomLeft(){
        return new Vec2D(0, height - 1);
    }

    public Vec2D getBottomRight(){
        return new Vec2D(width - 1, height - 1);
    }
}
