package lestatic;


public class LearnStatic {
//Static variable belongs to class not to the object
//Instance variable belongs to object
	int x = 0;
	static int y = 0;
	
	void counter() {
		x++;
		y++;
		System.out.println("Non-static => " +x+ " Static => " +y);
	}
	
	public static void main(String[] args) {
		LearnStatic ls = new LearnStatic();
		ls.counter();
		ls.counter();
		LearnStatic ls1 = new LearnStatic();
		ls1.counter();

	}

}
