package patterns.fluent;

public class FrutiDiMarre implements Pizza {
    @Override
    public Pizza getPizza() {
        System.out.print("3. Frutti di Mare ");
        return this;
    }

    @Override
    public Pizza getIngredients() {
        System.out.println("(Tomato Souce, Chees, Seafood)");
        return this;
    }

    @Override
    public Integer getCost() {
        return 20;
    }
}
