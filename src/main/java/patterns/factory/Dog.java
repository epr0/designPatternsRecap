package patterns.factory;

//COncrete product
public class Dog implements Animal {
    @Override
    public void doAnimalBehavior() {
        System.out.println("Woof.");
    }
}
