package patterns.strategy;

//Strategy Pattern
//Defines a family of algos, encapsulates each one, and makes them interchangable.
//Plug an play approach.
//3 algorithms, use which ever, whenever you want.
//Decouple algorithm from the program.
//Interchangable - whoever is using the algorithm, eg. Main class invokes the algorithm A
//They are not forced to change/refactor if algorithm changes.

//Main key - Client -> behaviour -> concrete Behaviour
public class StrategyMain {

    public static void main(String[] args) {
        Duck regularDuck = new RegularDuck(new RegularDuckFlying(), new RegularDuckQuacking());
        regularDuck.fly();
        regularDuck.quack();
        System.out.println();
        Duck rubberDuck = new RubberDuck(new RubberDuckFlying(), new RegularDuckQuacking());
        rubberDuck.quack();
        rubberDuck.fly();
    }
}
