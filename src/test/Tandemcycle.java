package test;

public class Tandemcycle extends Bicycle {
	public void seats()
	{
		System.out.println("tandem cycle has 2 seats");
		
	}
	public void handler()
	{
		System.out.println("tandem cycle has 2 handlers");
		
	}
	
	public static void main(String []args) {
		Tandemcycle obj= new Tandemcycle();
		obj.seats();
		obj.handler();
		obj.currentSpeed();
		obj.currentpedalcadence();
		obj.currentgear();
	}

}
