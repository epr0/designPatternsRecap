package patterns.strategy;

public class RubberDuckQuacking implements QuackingStrategy {

    public void quack() {
        System.out.println("Quacking like a fake rubber ducky... Quack!");
    }
}
