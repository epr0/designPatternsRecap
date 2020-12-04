package patterns.singleton;

/*
Singleton Pattern is a code smell?

Singleton ensures that the class will have ONLY ONE instance
It helps you to make imposible to instantiate a class more than once.
You will always get the same instance when creating an instance of a class.
And global access is provided for that instance.

Example - chat application. Chat should be a singleton. So we are sure
that everyone one is using the same chat.

But use this when you are 100 percent sure that you will need only once.
One mans constant is another mans variable :D

Singleton is a global variable, and in most cases it is a bad thing.
 */
public class SingletonMain {

    public static void main(String[] args) {
        //you cant do new ChatSingleton because constructor is private
        ChatSingleton chatSingleton = ChatSingleton.getChatInstance();
        chatSingleton.execute();
    }
}
