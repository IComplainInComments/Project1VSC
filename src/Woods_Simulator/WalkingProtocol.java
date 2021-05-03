


/*
    This enum stores the various different Walking Protocols a Person derived class can have.
*/
public enum WalkingProtocol
{
    WALK_RANDOM,
    WALK_UNIQUE,
    WALK_CIRCLES,
    WALK_BOUNCE
    ;

    // Takes a WalkingProtocol and a Position and generates an instance of a Person Derived Class that follows that protocol.
    public static Person generatePerson(WalkingProtocol enumval, Woods woods, Vec2D pos)
    {
        switch (enumval)
        {
            case WALK_RANDOM:
                return new Person_Random(woods, pos.x, pos.y);
            case WALK_UNIQUE:
                return new Person_Unique(woods, pos.x, pos.y);
            case WALK_CIRCLES:
                return new Person_Circles(woods, pos.x, pos.y);
            case WALK_BOUNCE:
                return new Person_Bounce(woods, pos.x, pos.y);
            default:
                System.out.println("ERROR: generatePerson(" + enumval + ") was not handled!");
                System.exit(1);
                return new Person_Random(); // Dummy return value to appease the Warnings for no return on default case.
        }
    }
    
}
