package functionalInterface;

/*
* An  Interface which have exactly one Abstract Method
* But can have multiple default and static methods
*/

/*
* if there is no SAM(single abstract method) then this is not functional interface
* we can create functional interface without its annotation but this will restrict to have exactly SAM
*/
@FunctionalInterface
public interface startFunctionalInterface
{

    public void start();

    default String name(String s)
    {
        return s;
    }

    static void stop()
    {
        System.out.println("stop");
    }
}
