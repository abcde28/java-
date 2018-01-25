package test;

public class Roadcycle extends Bicycle
{
	public void drophandlebars()
	{
		System.out.println("method calling drop handlebars");
		
	}
	public static void main(String []args) {
		Roadcycle obj= new Roadcycle();
		obj.drophandlebars();
		obj.currentSpeed();
		obj.currentpedalcadence();
		obj.currentgear();
	}
}
