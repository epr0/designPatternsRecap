package patterns.chain;

/*
Behavioral pattern
Consists a source of COMMAND objects and a series of PROCESSING objects

Each processing object in the chain is responsible for a certain type of command,
and the processing is done,
it forwards the command to the next processor in the chain.

The Chain of Responsibility pattern is handy for:

Decoupling a sender and receiver of a command
Picking a processing strategy at processing-time

 chain for handling authentication requests.

So, the input authentication provider will be the command,
 and each authentication processor will be a separate processor object.
 */
public class ChainMain {

    public static void main(String[] args) {

    }
}
