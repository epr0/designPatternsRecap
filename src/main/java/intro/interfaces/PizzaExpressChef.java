package intro.interfaces;

public class PizzaExpressChef implements Chef{
    @Override
    public void cookChicken() {
        System.out.println("Pizza express chicken");
    }

    @Override
    public void boilEggs() {
        System.out.println("Pizza express eggs");
    }

    @Override
    public void makeSweetCake() {
        System.out.println("Pizza express cake");
    }
}
