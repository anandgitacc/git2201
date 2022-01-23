package org.gittest;

public class Employee {
	
	private void empName() {
		System.out.println("Anand");
	}
	
	private void empMobile() {
		System.out.println("8939278836");
	}
	
	private void empStatus() {
		System.out.println("Working");
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.empMobile();
		e.empName();
	}
	

}
