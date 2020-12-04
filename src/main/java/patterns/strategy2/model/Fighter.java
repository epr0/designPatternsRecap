package patterns.strategy2.model;

import patterns.strategy2.jumping.JumpingBehavior;
import patterns.strategy2.punching.PunchingBehavior;

//superclass
//client
public class Fighter {

    JumpingBehavior jumpingBehavior;
    PunchingBehavior punchingBehavior;

    public Fighter(JumpingBehavior jumpingBehavior, PunchingBehavior punchingBehavior) {
        this.jumpingBehavior = jumpingBehavior;
        this.punchingBehavior = punchingBehavior;
    }

    public Fighter(PunchingBehavior punchingBehavior) {
        this.punchingBehavior = punchingBehavior;
    }

    public void punch() {
        punchingBehavior.punch();
    }

    public void jump() {
        jumpingBehavior.jump();
    }
}
