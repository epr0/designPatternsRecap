package patterns.fluent;

import java.util.Arrays;
/*
A fluent interface is normally implemented by using method chaining to implement method cascading
concretely by having each method return the object to which it is attached, often referred to as this or self. Stated more abstractly, a fluent interface relays the instruction context of a subsequent call in method chaining, where generally the context is

Defined through the return value of a called method
Self-referential, where the new context is equivalent to the last context
Terminated through the return of a void context
 */
public class FluentInterface {

    public static void main(String[] args) {
        new RestaurantImpl().name("Primavera").getMenu().orderPizza(Arrays.asList(new Integer[]{1, 3})).eatPizza().payPizza();
    }

}
