package Inheritence;

public class Program_06 extends Program_2 {
	
	public static void main(String[] args) {
		
		
		Program_2 x = new Program_2();
		Program_3 y = new Program_3();
		Program_4 z = new Program_4();
		Program_5 a = new Program_5();
		Program_06 b = new Program_06();
		
		
		
		System.out.println("Program-2 chiled");
		x.home();
		x.farm();
		x.flat();
		System.out.println();
		
		System.out.println("Program-3 chiled");
		y.farm();
		y.home();
		y.mobile();
		System.out.println();
		
		System.out.println("Program-4 chiled");
		z.home();
		z.farm();
		System.out.println();
		
		System.out.println("Program-5 subchild of program-2");
		a.home();
		a.farm();
		a.flat();
		a.laptop();
		
		System.out.println("Program-6 subchild of program-2");
		b.farm();
		b.home();
		b.flat();
		b.doctor();
		
		
	}
	
	public void doctor() {
		System.out.println("Son of Program-2 Son has a doctor");
	}

}
