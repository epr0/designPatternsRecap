package patterns.strategy;

//Single responsibility - implement flying behavior/strategy
public class RubberDuckFlying implements FlyingStrategy {

    @Override
    public void fly() {
        System.out.println("Not flying. Because it is rubber duck.");
    }
}
