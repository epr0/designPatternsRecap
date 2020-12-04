package patterns.strategy;

//Should not be flying
public class RubberDuck extends Duck {

    public RubberDuck(FlyingStrategy fs, QuackingStrategy qs) {
        super(fs, qs);
    }

    public void quack() {
        //from parent class
        quackingStrategy.quack();
    }

    public void fly() {
        flyingStrategy.fly();
    }
}
