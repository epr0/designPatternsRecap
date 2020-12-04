package patterns.factory;

/*
SimpleFactory //Not a pattern
FactoryMethod
AbstractFactory

Why do we need it?
We have lots of classes, We instantiate them very often.

       I
       |
       |
   /   |  \
  A    B   C

Classes of the same type. Like ducks. Or Fighters.

And let's say we want to instantiate one of these objects, but you do
NOT know which instance you need you use Factory Pattern.
Because if you KNOW which instance you want- you use DI simply.

So we need some business logic to determine which instance to create.

Also you can have several factories for same object creation but in a different way.

 */
public class FactoryMain {

    public static void main(String[] args) {
        AnimalFactory factory = new RandomAnimalFactory();
        Animal randomAnimal;

        for(int i = 0; i < 5; i++) {
            randomAnimal = factory.createAnimal();
            randomAnimal.doAnimalBehavior();
        }

        System.out.println();

        AnimalFactory otherFactory = new SequentialAnimalFactory();
        Animal unknownAnimal = otherFactory.createAnimal();
        unknownAnimal.doAnimalBehavior();
    }
}
