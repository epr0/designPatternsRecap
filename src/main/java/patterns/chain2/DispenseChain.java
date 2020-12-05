package patterns.chain2;

/*
The base interface should have a method to define the next processor in the chain and the method
 that will process the request. Our ATM Dispense interface will look like below.

 We need to create different processor classes that will implement the DispenseChain interface
 and provide implementation of dispense methods.
 Since we are developing our system to work with three types of currency bills
 – 50$, 20$ and 10$, we will create three concrete implementations.
 */
public interface DispenseChain {

	void setNextChain(DispenseChain nextChain);
	
	void dispense(Currency cur);
}