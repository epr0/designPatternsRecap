package patterns.singleton;

public class ChatSingleton {

    //constructor of the singleton IS PRIVATE
    //we can't construct this class from outside
    //but how we create a first singleton?
    //use static methods... But that's maybe a bad practice?
    private static ChatSingleton chatInstance = null;

    public static ChatSingleton getChatInstance() {
        if(chatInstance == null) {
            return new ChatSingleton();
        } else {
            return chatInstance;
        }
    }

    private ChatSingleton(){

    }

    public void execute() {
        System.out.println("Logic is executed");
    }


}
