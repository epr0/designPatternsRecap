package patterns.builder;

//concrete robot class based on plan
public class Robot implements RobotPlan {

    private String head;
    private String body;
    private String legs;
    private String hands;


    @Override
    public void setRobotHead(String head) {
        this.head = head;
    }

    @Override
    public void setRobotBody(String body) {
        this.body = body;
    }

    @Override
    public void setRobotLegs(String legs) {
        this.legs = legs;
    }

    @Override
    public void setRobotHands(String hands) {
        this.hands = hands;
    }

    public String getHead() {
        return head;
    }

    public String getBody() {
        return body;
    }

    public String getLegs() {
        return legs;
    }

    public String getHands() {
        return hands;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "head='" + head + '\'' +
                ", body='" + body + '\'' +
                ", legs='" + legs + '\'' +
                ", hands='" + hands + '\'' +
                '}';
    }
}
