package patterns.factory;

//Concrete Creator
public class SequentialAnimalFactory implements AnimalFactory{

    //Factory Method
    public Animal createAnimal() {
        User user = new User();
        user.setRole("ADMIN");

        if(user.getRole().equals("ADMIN")) {
            return new Dog();
        }
        return new Duck();
    }
}
