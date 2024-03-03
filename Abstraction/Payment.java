package Abstraction;

public class Payment {
	
	public static void main(String[] args) throws InterruptedException {
		
		
	Amazon x = RazorGateway.makePayment("#234");
	x.trs();
	
	}
}
