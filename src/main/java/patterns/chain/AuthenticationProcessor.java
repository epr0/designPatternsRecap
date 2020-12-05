package patterns.chain;

//Abstract class for processor of authentication
//First we declare this abstract process
public abstract class AuthenticationProcessor {

    // next element in chain or responsibility
    public AuthenticationProcessor nextProcessor;

    public AuthenticationProcessor(AuthenticationProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }
    //abstract method to be implmented
    public abstract boolean isAuthorized(AuthenticationProvider authProvider);
}