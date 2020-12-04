package intro.abstraction;
//OOP
// Encapsuation
// Abstraction
// Inheritance
// Polymorphism


//Abstraction - hiding implementation details from the actual user.
//User does not care how remote send the actual signal to tv
//he cares WHAT the button does, not HOW.
//example remote control
public class MailService extends Service {

    public void sendEmail() {
        connect();
        authenticate();
        //send email
        disconnect();
    }

    //make private to hide impl logic, and so method cant be invoked outside.
    //so when u change details here, main class is not affected.
    public void connect() {
        System.out.println("Connect");
    }
    //make private to hide impl logic, and so method cant be invoked outside.
    public void disconnect() {
        System.out.println("Disonnect");
    }
    //make private to hide impl logic, and so method cant be invoked outside.
    public void authenticate() {
        System.out.println("Authenticate");
    }

    @Override
    public void doAbstractThings() {
        System.out.println("Doing abstract things in my own way...");
    }
}
