package abstraction;

public class RepairShop {
	
	public static void repairCar(Car car) {
		
		System.out.println("Car is repaired");
		}
	
	public static void main(String[] args) {
		
		WagonR wagonR = new WagonR();
		Audi audi = new Audi();
		
	  //  Car car = new Car(); // as Car is an abstract class and if we solve it using inheritance then we should have to make objects of car 
		
		repairCar(wagonR);
		repairCar(audi);
	}

}
