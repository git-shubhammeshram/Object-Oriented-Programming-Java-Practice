package Polymorphism;

public class CarLounch {
	
	public static void main(String[] args) {
		
		Class_Specifications sp = new Class_Specifications();
		
		Class_Audi x1 = new Class_Audi();
		Class_Maruti x2 = new Class_Maruti();
		Class_Tata x3 = new Class_Tata();
		Class_Bmw x4 = new Class_Bmw();
		Class_Thar x5 = new Class_Thar();
		
		sp.getSpecifications(x1);
		sp.getSpecifications(x2);
		sp.getSpecifications(x3);
		sp.getSpecifications(x4);
		sp.getSpecifications(x5);

	
	}

}
