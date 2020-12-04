package patterns.builder;

/*
Used to create objects made from a bunch of other objects
When you need to created object which consists of other objects
builder knows the specifics of creation of those objects
 */
public class BuilderMain {

    public static void main(String[] args) {
        /*
        Lets say client wants a robot to be built.

         */
        RobotBuilder builder = new OldRobotBuilder();

        RobotEngineer engineer = new RobotEngineer(builder);

        engineer.makeRobot();

        Robot firstRobot = engineer.getRobot();

        System.out.println(firstRobot);

    }
}
