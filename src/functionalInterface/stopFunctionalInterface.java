package functionalInterface;

/*
 * This is not throwing anyKind of error
 because
 * it is extending an interface which is a Functional interface
*/

@FunctionalInterface
public interface stopFunctionalInterface extends startFunctionalInterface
{
/*
 * this will throw error because there can be only Abstract method in parent and child combined
*/

    //public void stop();

    // this is not throwing error because both methods are same in the child and parent interface
    void start();

}
