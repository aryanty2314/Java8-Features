package functionalInterface;


public class trying implements startFunctionalInterface {
    @Override
    public void start() {
        System.out.println("Starting functional interface");
    }

    @Override
    public String name(String s) {
        return startFunctionalInterface.super.name(s);
    }
}
