package patterns.strategy2.punching;

public class StrongPunching implements PunchingBehavior {
    @Override
    public void punch() {
        System.out.println("Punching very hard!");
    }
}
