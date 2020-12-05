package patterns.chain2;

import java.util.Scanner;

/*
Chain of responsibility pattern is used to achieve loose coupling in software design
where a request from client is passed to a chain of objects to process them.
 Then the object in the chain will decide themselves who will be processing the request
  and whether the request is required to be sent to the next object in the chain or not.

  ATM Dispense machine.
   The user enters the amount to be dispensed and the machine dispense amount
  in terms of defined currency bills such as 50$, 20$, 10$ etc.

  If the user enters an amount that is not multiples of 10, it throws error.

  Note that we can implement this solution easily in a single program itself
   but then the complexity will increase
    and the solution will be tightly coupled.
    So we will create a chain of dispense systems to dispense bills of 50$, 20$ and 10$.
 */
public class ATMDispenseChain {

	private DispenseChain c1;

	public ATMDispenseChain() {
		// initialize the chain
		this.c1 = new Dollar50Dispenser();
		DispenseChain c2 = new Dollar20Dispenser();
		DispenseChain c3 = new Dollar10Dispenser();

		// set the chain of responsibility
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}

	public DispenseChain getC1() {
		return c1;
	}

	public void setC1(DispenseChain c1) {
		this.c1 = c1;
	}
}