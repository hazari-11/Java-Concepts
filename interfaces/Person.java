package interfaces;

public class Person implements Student, YouTuber {

	public static void main(String[] args) {
		
		Person obj = new Person();
//		obj.study();
//		obj.makeVideos();
		
		YouTuber obj2 = obj; // upcasting (object of Person made)
		obj2.editVideo();
		obj2.makeVideos();
		
	//	YouTuber u = new YouTuber(); //can't instantiate interface like abstract classes
        
	}

	@Override
	public void study() {
		
		System.out.println("Person is studying");
		
	}

	@Override
	public void makeVideos() {
		
		System.out.println("Person is making a good video");
		
	}

	@Override
	public void editVideo() {
		 System.out.println("YouTuber is editing");
		
	}
	
	public void uploadVideo() {  // overriding is choice here as uploadVideo() is default class - pros
		 
		System.out.println("uploading video"); // implementation is required here to overcome cons
	}

}
