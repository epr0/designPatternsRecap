package patterns.fluent;

public class Margarita implements Pizza {

    @Override
    public Pizza getPizza() {
        System.out.print("1. Margharita ");
        return this;
    }

    @Override
    public Pizza getIngredients() {
        System.out.println("(Tomato Souce, Chees)");
        return this;
    }

    @Override
    public Integer getCost() {
        return 10;
    }
}
