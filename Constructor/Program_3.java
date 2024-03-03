package Constructor;

import java.util.Scanner;

public class Program_3 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Id");
		int id = scn.nextInt();
		
		System.out.println("Enter Name");
		String name = scn.next();
		
		System.out.println("Enter Address");
		String addrss = scn.next();
		
		Program_2 emp = new Program_2(id, name, addrss);
		
		System.out.println(emp);
		
		
	}

}
