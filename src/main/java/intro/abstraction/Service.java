package intro.abstraction;

public abstract class Service {

    public abstract void doAbstractThings();

    public void doSpecificServiceThings() {
        System.out.println("Doing general stuff....");
    }
}
