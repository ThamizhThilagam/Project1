package stavar;

public class LearnStaticMethod {
	
	public static void displayName() {
		System.out.println("Thamizh");
	}

	public static void main(String[] args) {
		//LearnStaticMethod ls = new LearnStaticMethod();
		//without object we can call the static method and without the class name we can call within the class
		//Static method is used to do small utility function
		//Cannot call non=static variable inside a static method
		//this keyword won't work in static method as both represents class
		LearnStaticMethod.displayName();
		displayName();
		
		

	}

}
