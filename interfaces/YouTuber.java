package interfaces;

public abstract interface YouTuber extends VideoEditor {
	
	public static final int x = 6 ; // int x = 6 is also right
	
    abstract void makeVideos(); // void makeVideos() is also right as public static final is default here
    
    default void uploadVideo() {    // we can do it after 8.0 as its 11.0 version using default  keyword
    	
    	System.out.println("Upload the video");  // could be a Diamond Problem - cons
    	
    }

}
