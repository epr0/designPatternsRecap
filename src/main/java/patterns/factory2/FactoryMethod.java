package patterns.factory2;

public class FactoryMethod {

    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        Pizza margharita = factory.getPizza(1);
        Pizza capriciosa = factory.getPizza(2);
        System.out.println(margharita.getDetectedPizza());
        System.out.println(capriciosa.getDetectedPizza());

    }
}
