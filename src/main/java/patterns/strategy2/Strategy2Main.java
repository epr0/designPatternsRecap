package patterns.strategy2;

import patterns.strategy2.jumping.HighJumping;
import patterns.strategy2.jumping.LowJumping;
import patterns.strategy2.model.Fighter;
import patterns.strategy2.model.Ken;
import patterns.strategy2.model.Ryu;
import patterns.strategy2.punching.StrongPunching;
import patterns.strategy2.punching.WeakPunching;

//Strategy patterns defines the family of algorithms
//Punching and Jumping algorithms are defined and ENCAPSULATED.
//MAKES THEM INTERCHANGABLE. So you can change jumping strategy from high to low.
//Without affecting the client since the algorithms are of the same type.
public class Strategy2Main {

    public static void main(String[] args) {
        //choose the player in the menu screen.
        //FIGHT!
        Fighter fighter = new Fighter(new HighJumping(), new StrongPunching());
        fighter.jump();
        fighter.punch();

        System.out.println();

        //but what if we have more different players?

        Fighter ryu = new Ryu(new LowJumping(), new WeakPunching());
        ryu.jump();
        ryu.punch();

        System.out.println();

        Fighter ken = new Ken(new HighJumping(), new StrongPunching());
        ken.jump();
        ken.punch();

    }
}
