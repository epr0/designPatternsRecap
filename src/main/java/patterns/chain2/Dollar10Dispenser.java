package patterns.chain2;

/*
The important point to note here is the implementation of dispense method.
 You will notice that every implementation is trying to process the request
  and based on the amount, it might process some or full part of it.

  If one of the chain not able to process it fully, it sends the request to the next processor
   in chain to process the remaining request.
    If the processor is not able to process anything,
     it just forwards the same request to the next chain.

     This is a very important step and we should create the chain carefully,
      otherwise a processor might not be getting any request at all.
      For example, in our implementation if we keep the first processor chain as
      Dollar10Dispenser and then Dollar20Dispenser, then the request will
      never be forwarded to the second processor and the chain will become useless
 */
public class Dollar10Dispenser implements DispenseChain {

	private DispenseChain chain;
	
	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain=nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		if(cur.getAmount() >= 10){
			int num = cur.getAmount()/10;
			int remainder = cur.getAmount() % 10;
			System.out.println("Dispensing "+num+" 10$ note");
			if(remainder !=0) {
				this.chain.dispense(new Currency(remainder));
			}
		}else{
			this.chain.dispense(cur);
		}
	}

}