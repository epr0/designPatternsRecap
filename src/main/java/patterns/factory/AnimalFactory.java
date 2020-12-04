package patterns.factory;

/*

FactoryMethod pattern defines an interface/or superclass for creating AN OBJECT, but
lets subclasses which class to instantiate.

so implementing factories will decide which object to instantiate.
DogFactory impl AnimalFactory, so DogFactory decides what to instantiate.

Product, Creator, Concrete Product, ConcreteCreator.
 */
//Creator
public interface AnimalFactory {

    //Factory Method
    Animal createAnimal();
}
