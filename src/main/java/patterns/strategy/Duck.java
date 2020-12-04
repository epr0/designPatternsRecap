package patterns.strategy;

//Superclass
//HAS  A - COMPOSITION
//IS A - INHERITANCE
public class Duck {

    FlyingStrategy flyingStrategy;
    //we can theoretically hardcode the behavior/strategy
    //flyingStrategy = new SpecificFlyingStrategy();
    QuackingStrategy quackingStrategy;

    public Duck(FlyingStrategy fs, QuackingStrategy qs) {
        this.flyingStrategy = fs;
        this.quackingStrategy = qs;
    }

    //algorithm
    public void fly() {
        this.flyingStrategy.fly();
    }

    //Algorithm
    void quack() {
        this.quackingStrategy.quack();
    }

}
