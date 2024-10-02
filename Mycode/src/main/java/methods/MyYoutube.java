package methods;

public class MyYoutube {

	public static void main(String[] args) {
		
		YouTuber yt = new YouTuber();
		yt.createVideo();
		String shared = yt.shareVideo();
		System.out.println(shared);
		
	}

}
