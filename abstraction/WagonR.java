package abstraction;

public class WagonR extends Car{
	
	
	
	public void brake() {
		System.out.println("WagonR is braking");
	}

	@Override //annotation, now compiler knows that it is supposed to be overridden
	public void accelerate() {
		System.out.println("WagonR is accelerating");
		}

}
