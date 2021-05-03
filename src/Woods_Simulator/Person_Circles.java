


/*
    This type of Person will make a circle around every tile they walk to, effectively widening their visibility range.
    They will choose a random position on the circle to start from and a random direction, then do one full rotation.
    Then, they will move a couple more tiles randomly before circling around again.
*/
public class Person_Circles extends Person_Random
{
    // How many random steps to take before doing another circle.
    protected final int RANDOM_STEPCOUNT = 4;

    // How many non-neutral directions there are.
    protected final int NUM_DIRECTIONS = 8;

    // Used internally to determine what next step to take.
    protected int stepCounter;

    // Determines whether to Walk in a Circle or to Walk Randomly.
    protected boolean isWalkingCircle;

    // The starting position for the Walking Circle.
    protected Vec2D circleCenterPos;

    // The Direction (+1 Clockwise, -1 Counter-Clockwise) to run around the circle.
    protected int circleDirection;

    // The starting angle to run around the circle from.
    protected int initialAngle;


    // Default Constructor
    public Person_Circles()
    {
        super();
        stepCounter = 0;
        isWalkingCircle = false;
        circleCenterPos = null;
        circleDirection = 0;
        initialAngle = 0;
    }
    
    // Constructor
    public Person_Circles(Woods woods, int x, int y)
    {
        super(woods, x, y);
        stepCounter = 0;
        isWalkingCircle = false;
        circleCenterPos = position;
        circleDirection = 0;
        initialAngle = 0;
    }
    
    @Override
    protected Vec2D nextPosition()
    {
        if (leader == this)
        {
            if (isWalkingCircle) // Go around the starting position in a circle.
            {
                ++stepCounter;
                if (stepCounter >= NUM_DIRECTIONS)
                {
                    stepCounter = 0;
                    isWalkingCircle = false;
                    return circleCenterPos;
                }
                else
                {
                    int currentAngle = modAngle(initialAngle + circleDirection * stepCounter);
                    Vec2D offset = angleToVec(currentAngle);
                    return circleCenterPos.add(offset);    
                }
            }
            else // Choose a completely random direction to walk.
            {
                ++stepCounter;
                if (stepCounter >= RANDOM_STEPCOUNT)
                {
                    stepCounter = 0;
                    isWalkingCircle = true;
                    circleCenterPos = position;
                    circleDirection = randrangeInt(0, 1) * 2 - 1; // Either -1 or +1
                    initialAngle = randrangeInt(0, NUM_DIRECTIONS - 1);
                }
                return super.nextPosition();
            }
        }
        else // Follow the leader.
        {
            return leader.position;
        }
    }

    // Limits an angle to the range [0, numDirections).
    protected int modAngle(int angle)
    {
        while (angle < 0) angle += NUM_DIRECTIONS;
        while (angle >= NUM_DIRECTIONS) angle -= NUM_DIRECTIONS;
        return angle;
    }

    // Converts an Angle to a Unit Offset.
    protected Vec2D angleToVec(int angle)
    {
        int angleDir = modAngle(angle);
        switch (angleDir)
        {
            case 0: // Right
                return new Vec2D(1, 0);
            case 1: // Down-Right
                return new Vec2D(1, 1);
            case 2: // Down
                return new Vec2D(0, 1);
            case 3: // Down-Left
                return new Vec2D(-1, 1);
            case 4: // Left
                return new Vec2D(-1, 0);
            case 5: // Up-Left
                return new Vec2D(-1, -1);
            case 6: // Up
                return new Vec2D(0, -1);
            case 7: // Up-Right
                return new Vec2D(1, -1);
            
            default: // Neutral (Impossible Default)
                return new Vec2D(0, 0);
        }
    }

    public String toString(){
        return super.toString() + " -Circles";
    }
}
