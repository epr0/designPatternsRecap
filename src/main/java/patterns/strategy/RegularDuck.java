package patterns.strategy;

//Wild duck IS A
public class RegularDuck extends Duck {

    public RegularDuck(FlyingStrategy fs, QuackingStrategy qs) {
        super(fs, qs);
    }

    public void quack() {
        quackingStrategy.quack();
    }

    public void fly() {
        flyingStrategy.fly();
    }
}
