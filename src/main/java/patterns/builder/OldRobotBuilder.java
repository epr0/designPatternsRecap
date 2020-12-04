package patterns.builder;

public class OldRobotBuilder implements RobotBuilder {

    //Composition
    private Robot robot;

    public OldRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Rusty head");
    }

    @Override
    public void buildRobotBody() {
        robot.setRobotBody("Rusty Body");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Rusty Legs");
    }

    @Override
    public void buildRobotHands() {
        robot.setRobotHands("Rusty Hands");
    }

    @Override
    public Robot getRobot() {
        return robot;
    }
}
