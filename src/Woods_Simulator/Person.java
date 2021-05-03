


/*
    An Abstract Class for representing a Person wandering in the woods.
    It is meant to extended by many classes that implement their own "Walking Protocol" via the nextPosition() method.
    Derived Classes may store any additional data required to implement their Walking Protocol.
*/
public abstract class Person
{
    // The Current Position of the Person.
    protected Vec2D position;

    // The Previous Position of the Person.
    protected Vec2D prevPosition;

    // This reference is used to make it so if two people land on the same square, they will walk together.
    protected Person leader;
    
    // A Reference to the Woods that the person is walking in.
    protected Woods woodsRef;

    
    // Returns the Next Position generated by a derived class's Walking Protocol.
    abstract protected Vec2D nextPosition();

    // Default Constructor
    public Person()
    {
        this.position = null;
        this.prevPosition = null;
        this.leader = null;
        this.woodsRef = null;
    }

    // Constructor
    public Person(Woods woods, int x, int y)
    {
        this.position = new Vec2D(x, y);
        this.prevPosition = new Vec2D(x, y);
        this.leader = this;
        this.woodsRef = woods;
    }

    // Moves the Person to a new position. (Can be extended if more actions are required for a derived class's implemention)
    public void moveTo(Vec2D coord)
    {
        prevPosition = position;
        position = coord;
    }

    public Vec2D getPosition(){
        return this.position;
    }

    public String toString(){
        return position.toString();
    }
}