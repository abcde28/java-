package test;

public class Mountaincycle extends Bicycle {
	public void chainring()
	{
		System.out.println("method calling chain ring");
		
	}
	public static void main(String []args) {
		Mountaincycle obj= new Mountaincycle();
		obj.chainring();
		obj.currentSpeed();
		obj.currentpedalcadence();
		obj.currentgear();
	}
}
