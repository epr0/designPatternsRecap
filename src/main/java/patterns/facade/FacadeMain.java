package patterns.facade;

/*
Facade is a structural design pattern that provides a simplified interface to a library,
 a framework, or any other complex set of classes.


 If you got bunch of classes. And bunch of interactions.
 Like class a uses b and c, c used a and d and so on...

 And if you have a client. Class which uses those classes.
 Problem that we have lots of coupling.

 When we do one class - one responsibility we and up with lots of classes.
 Classes which are not meaningful enough.

 So let's say we invoke a service a like new ServiceA();
 but it requires serviceB as an argument to work new ServiceA(new ServiceB(new ...)
 and so on...

 Facade is the face of the building. The front. The outside.
 But you need wiring, pipes, foundation etc.
 So underneath facade we have lots of things going on,
 but we want to interact only with the face of the house.
 Client > Facade (and facade here deals with all the hidden complexities)
 Like you see lamps on the facade, but you don't see how the wiring is installed.
 So facade invokes lightning which invokes wiring, etc.

 So Client uses the facade and facade does the interactions with all the pieces,
 instead of a client interacting with separate pieces separately.
 */
public class FacadeMain {

    /*
    Law of Demeter OR Principle of least knowledge.
    Objects should only talk WITH their friends, but not with their FRIENDS FRIENDS.
    That introduces tight coupling otherwise.

    Lets say pen is working as usual writing when used. I am dependant on the pen.
    I know how to use it to write.
    Let's say pen changes, you need to use it differently to write now.
    So i, as i client, have to change and learn how to write differently in order to
    use the pen.

    So you an do a.b , but not a.b.c
    A is you, B is your friend, C is your friends neighbour.

    Facade hides much of the complexity and makes the subsystem easy to use.
    Also, if we need to use the complex subsystem directly, we still can do that;
    we aren't forced to use the facade all the time.

    It decouples a client implementation from the complex subsystem.
     */
    public static void main(String[] args) {

        AirFlowController airFlowController = new AirFlowController();
        CoolingController coolingController = new CoolingController();
        FilterSystem filterSystem = new FilterSystem();
        FuelInjector fuelInjector = new FuelInjector();
        Starter starter = new Starter();

        airFlowController.takeAir();
        coolingController.setTemperatureUpperLimit();
        coolingController.run();
        filterSystem.turnOn();
        filterSystem.filter();
        fuelInjector.turnOn();
        fuelInjector.inject();
        starter.start();

        //stopping logic...

        //So now in facade we can hide all the complexity written above in two methods.
        //Start and stop engine.
        CarEngineFacade carEngineFacade = new CarEngineFacade();
        carEngineFacade.startEngine();
    }
}
