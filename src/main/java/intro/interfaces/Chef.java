package intro.interfaces;

//Does not matter WHO the chef is, you just want to be sure he cooks specific food
//in that case you loose the coupling of your system
//you are not dependant on specific cheff like
//AsianChef chef = new AsianChef();
//instead - Chef chef = new AsianChef();
public interface Chef {
    void cookChicken();
    void boilEggs();
    void makeSweetCake();
}
