package methods2;

public class YouTuber {
	//youtuber's behaviors/actions are methods
	//youtuber's variables are properties
	//syntax of method
	// accessModifier returnType methodName(){
	// }
	// If accessModifier is not mentioned then it is default/package
	//return value should always be printed
	//without hard coding the values for variable each time, the parameters/arguments can be passed in methods
	/*Method overloading:
	 * with same methodName various data type of arguments can be passed
	 * eg:syso*/
	
	
	public static void main(String[] args) {
		YouTuber oy = new YouTuber();
		oy.deleteVideo("A123");
		oy.deleteVideo(true);
	}
	private void deleteVideo(String videoId) {
		System.out.println("Deleted Video - " +videoId);
	}
	private void deleteVideo(boolean videoId) {
		System.out.println("Deleted Video - " +videoId);
	}
	
	public void createVideo() {
		System.out.println("Video created");
	}

	private boolean uploadVideo() {
		System.out.println("Uploading");
		return true;
	}
	
	public String shareVideo() {
		return "facebook";
	}
	
}
