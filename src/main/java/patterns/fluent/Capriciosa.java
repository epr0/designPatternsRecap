package patterns.fluent;

public class Capriciosa implements Pizza {

    @Override
    public Pizza getPizza() {
        System.out.print("2. Capriciosa ");
        return this;
    }

    @Override
    public Pizza getIngredients() {
        System.out.println("(Tomato Souce, Chees, Ham, Mushrooms)");
        return this;
    }

    @Override
    public Integer getCost() {
        return 15;
    }
}
