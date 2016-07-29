

public class CarTest extends Car{
	public static void main (String []args)
	{
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.color = "blue";
		car2.color = "white";
		
		System.out.println("Creating car1 car2");
		System.out.print("car2 color is: " 
						+ car2.color);
				
		JamesBondCar jBondCar = new JamesBondCar();
		jBondCar.isGunOnBoard = false;
		
		System.out.println("\nJamesBondCar Creating");
		System.out.println("isGunOnBoard: " 
						  + jBondCar.isGunOnBoard);
		
		
	}
}

