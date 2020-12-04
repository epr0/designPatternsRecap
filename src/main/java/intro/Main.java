package intro;

import intro.classes.User;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        User user = new User(); //new instance of user class
        user.name = "Igor";
        user.hello();

    }
}
