package lists;

public class Pair<X, Y> { //generics of two types , we can also make of 1 , 3 and many more 
	
	X x;
	Y y;
	
	public Pair(X x, Y y) {
		this.x = x ;
		this.y = y;
	}
	
	public void getDescription() {
		System.out.println(x + " and " + y);
	}

}
