package Abstraction;

public class RazorGateway {

	public static Amazon makePayment(String pay) {
		// TODO Auto-generated method stub
		
		if(pay.equalsIgnoreCase("#123")) {
			 return new Gpay();
		}
		else if (pay.equalsIgnoreCase("#234")) {
			return new PhonePay();
		}
		else if (pay.equalsIgnoreCase("#345")) {
			return new Paytm();
		}
		else {
			return null;
		}

	}
}
