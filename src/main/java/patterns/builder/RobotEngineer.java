package patterns.builder;

public class RobotEngineer {

    private RobotBuilder robotBuilder;

    public RobotEngineer(RobotBuilder robotBuilder) {
        this.robotBuilder = robotBuilder;
    }

    public Robot getRobot() {
        return this.robotBuilder.getRobot();
    }

    public void makeRobot() {
        robotBuilder.buildRobotHead();
        robotBuilder.buildRobotBody();
        robotBuilder.buildRobotLegs();
        robotBuilder.buildRobotHands();
    }
}
