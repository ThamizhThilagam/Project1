package lestatic;

public class Person {
	int x = 0;
	static int y= 0;
	
	public void increment() {
		x++;
		y++;
		System.out.println("Non-static value is " +x+ " Static value is " +y);
	}

}
