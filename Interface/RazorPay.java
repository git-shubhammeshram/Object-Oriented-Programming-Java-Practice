package Interface;

public class RazorPay {

	public static Amazon get(String pay ) {
		
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
