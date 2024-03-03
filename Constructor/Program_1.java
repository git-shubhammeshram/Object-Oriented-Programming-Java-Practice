package Constructor;

public class Program_1 {
	
	public Program_1() {
		
//		this(10);
		System.out.println("Zero Para Constructor");
		
	}
	
	public Program_1(int a) {
		
		this(10,20);
		System.out.println("Single Para Constructor");
	}
	
	public Program_1(int a ,int b) {
//		this("Shubham");
		System.out.println("Double Para Constructor");
	}
	
	public Program_1(String name) {
		
		System.out.println("String Constructor");
	}
	
	public static void main(String[] args) {
		
		
		new Program_1(10);
		
		
		
	}

}
