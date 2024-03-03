package Abstraction;

public abstract class Amazon {

	public abstract void trs() throws InterruptedException;
	
	public void msg() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Trancation Succesfully!!!");
	}
}
