package patterns.strategy2.jumping;

public class LowJumping implements JumpingBehavior {
    @Override
    public void jump() {
        System.out.println("Jumping very low. Like a noob. Need to train more.");
    }
}
