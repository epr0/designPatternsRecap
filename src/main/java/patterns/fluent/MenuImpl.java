package patterns.fluent;

import java.util.ArrayList;
import java.util.List;

public class MenuImpl implements Menu {

    List<Pizza> menuList = new ArrayList<>();
    List<Pizza> selectedList = new ArrayList<>();

    public MenuImpl() {
        Pizza margharita = new Margarita();
        Pizza capriciosa = new Capriciosa();
        Pizza fruttidimare = new FrutiDiMarre();

        menuList.add(margharita);
        menuList.add(capriciosa);
        menuList.add(fruttidimare);
    }


    @Override
    public Menu orderPizza(List<Integer> orders) {
        System.out.println("Order pizza:");
        for (Integer index : orders) {
            Pizza pizza = menuList.get(index - 1);
            selectedList.add(pizza);
            pizza.getPizza().getIngredients();
        }
        return this;
    }

    @Override
    public Menu eatPizza() {
        System.out.println("Eating: ");
        for (Pizza pizza : selectedList) {
            pizza.getPizza();
            System.out.println("");
        }
        return this;
    }

    @Override
    public Menu payPizza() {
        int cost = 0;
        for (Pizza pizza : selectedList) {
            cost = cost + pizza.getCost();
        }
        System.out.println("Paying: " + cost + "$");
        return this;
    }

    @Override
    public Pizza getPizza(int index) {
        if (index < 4 && index > 0) {
            return menuList.get(index - 1);
        }
        return null;
    }

    public void showMenu(String name) {
        System.out.println("MENU IN " + name);
        for (Pizza pizza : menuList) {
            pizza.getPizza().getIngredients();
        }
    }

}
