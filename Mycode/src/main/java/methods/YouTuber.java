package methods;

public class YouTuber {
	//youtuber's behaviors/actions are methods
	//youtuber's variables are properties
	//syntax of method
	// accessModifier returnType methodName(){
	// }
	// If accessModifier is not mentioned then it is default/package
	//return value should always be printed
	
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
