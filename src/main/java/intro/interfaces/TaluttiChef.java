package intro.interfaces;

public class TaluttiChef implements Chef {
    @Override
    public void cookChicken() {
        System.out.println("Talluti chicken");
    }

    @Override
    public void boilEggs() {
        System.out.println("Talluti eggs");
    }

    @Override
    public void makeSweetCake() {
        System.out.println("Talluti cake");
    }


    //ANF IF after some time some functionality adds here
    //main functionality in main class will not be affected
    public void makeNewDish() {
        System.out.println("new dish is made");
    }
}
