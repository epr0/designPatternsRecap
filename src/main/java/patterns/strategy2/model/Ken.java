package patterns.strategy2.model;

import patterns.strategy2.jumping.JumpingBehavior;
import patterns.strategy2.punching.PunchingBehavior;

public class Ken extends Fighter {

    public Ken(JumpingBehavior jumpingBehavior, PunchingBehavior punchingBehavior) {
        super(jumpingBehavior, punchingBehavior);
    }
}
