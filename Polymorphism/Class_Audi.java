package Polymorphism;

public class Class_Audi extends Class_Car{
	
	@Override
	public void milage() {
		System.out.println("Audi Milage");
	}
	@Override
	public void speed() {
		System.out.println("Audi Speed");
	}
	@Override
	public void color() {
		System.out.println("Audi Color");
	}
	@Override
	public void EngineType() {
		System.out.println("Audi Engine");
	}
	@Override
	public void fuelType() {
		System.out.println("Audi Fuel");
	}


}
