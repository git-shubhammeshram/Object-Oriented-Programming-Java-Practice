package Polymorphism;

public class Class_Sum {
	
	public void sum(int a) {
		
		System.out.println(a);
	}
    public void sum(int a, int b) {
		
		System.out.println(a+" "+b);
	}
    public void sum(String name, String address) {
	
    	System.out.println(name+" "+address);
	
    }
    public void sum(int a, String name) {
	
    	System.out.println(a+" "+name);
    }
    public void sum(int a, float b, char ch) {
	
    	System.out.println(a+" "+b+" "+ch);
   }
   public void sum(int a, int b, int c) {
	
	   System.out.println(a+" "+b+" "+c);
   }

	
	

}
