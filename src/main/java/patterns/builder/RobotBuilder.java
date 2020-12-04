package patterns.builder;

public interface RobotBuilder {

    void buildRobotHead();
    void buildRobotBody();
    void buildRobotLegs();
    void buildRobotHands();
    Robot getRobot();

}
