package patterns.strategy;

public class RegularDuckQuacking implements QuackingStrategy {

    public void quack() {
        System.out.println("Quacking as a regular duck. Quack! Quack!");
    }
}
