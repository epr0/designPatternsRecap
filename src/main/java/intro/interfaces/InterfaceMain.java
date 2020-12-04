package intro.interfaces;

import java.util.ArrayList;
import java.util.List;

public class InterfaceMain {

    public static void main(String[] args) {
        //program to interface, not concrete implementation
        //means that you don't really need any special features of TallutiChef,
        // you "promise" to "only" use the features exposed by the Chef interface
        //So if the cheff will change in the future
        //Functionality and dependencies will not break.
        Chef bestChef = getTheBestChef();
        bestChef.boilEggs();
        //Good usage
        List<String> s = new ArrayList<>();
        //not used 99 percent of the time
        //when you need more methods than described in List interface
        ArrayList<String> arrayList = new ArrayList<>();

        //for return values
        //If logic in getChefForNightShift changes
        //and more chefs are hired, nothing breaks here
        //since we are programming to an interface.
        Chef chefOnDuty = getChefForNightShift("Monday");
        //PizzaExpressChef chefOnDutyAlso = getChefForNightShift("Tuesday");

    }

    public static Chef getChefForNightShift(String day) {
        if(day.equals("Monday")) {
            return new TaluttiChef();
        } else {
            return new PizzaExpressChef();
        }
    }

    public static Chef getTheBestChef() {
        return new TaluttiChef();
    }
}
