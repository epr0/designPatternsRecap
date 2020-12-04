package patterns.factory;

//COncrete product
public class Cat implements Animal {
    @Override
    public void doAnimalBehavior() {
        System.out.println("Meow.");
    }
}
