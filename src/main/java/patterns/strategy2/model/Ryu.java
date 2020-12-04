package patterns.strategy2.model;

import patterns.strategy2.jumping.JumpingBehavior;
import patterns.strategy2.punching.PunchingBehavior;

public class Ryu extends Fighter {


    public Ryu(JumpingBehavior jumpingBehavior, PunchingBehavior punchingBehavior) {
        super(jumpingBehavior, punchingBehavior);
    }

    //only punching
    public Ryu(PunchingBehavior punchingBehavior){
        super(punchingBehavior);
    }

}
