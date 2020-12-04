package patterns.factory;

//Concrete Product
public class Duck implements Animal{
    @Override
    public void doAnimalBehavior() {
        System.out.println("Quack.");
    }
}
