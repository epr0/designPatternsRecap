package patterns.strategy2.punching;

public class WeakPunching implements PunchingBehavior {
    @Override
    public void punch() {
        System.out.println("Punching very weak. Like a child!");
    }
}
