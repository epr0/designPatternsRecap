package patterns.facade;

//sometimes this pattern might be overused.
public class CarEngineFacade {

    private AirFlowController airFlowController = new AirFlowController();
    private CoolingController coolingController = new CoolingController();
    private FilterSystem filterSystem = new FilterSystem();
    private FuelInjector fuelInjector = new FuelInjector();
    private Starter starter = new Starter();

    public void startEngine() {
        airFlowController.takeAir();
        coolingController.setTemperatureUpperLimit();
        coolingController.run();
        filterSystem.turnOn();
        filterSystem.filter();
        fuelInjector.turnOn();
        fuelInjector.inject();
        starter.start();
    }

    public void stopEngine() {
        System.out.println("Stop engine...");
    }
}
