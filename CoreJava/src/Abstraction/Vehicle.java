package Abstraction;

public abstract class Vehicle {
	//abstract method
	public abstract void start() ;
	 
	public abstract void drive();
	
	//concrete methods 
	/*
	 * concrete methods are those methods which are not declared by using keyword abstract.
	 * 
	 * */
	public static  void accelerate() {
		System.out.println("accelerate the vehicle");
	}
	public void stop() {
		System.out.println("Stop the vehicle");
	}
		
	

}
