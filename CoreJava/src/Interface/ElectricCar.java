package Interface;


// class interface ko implements karta hai..
public class ElectricCar implements Car {
	@Override
	public void start() {
		System.out.println("Start the Vehicle");
	}
	@Override
	public void stop() {
		System.out.println("Stop the Car");
	}
	@Override
	public void openGate() {
		System.out.println("open the gate of Car");
		
	}

}
