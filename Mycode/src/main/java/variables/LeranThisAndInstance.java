package variables;

public class LeranThisAndInstance {
	
	int c; //instance variable has default value
	void addTwoNumbers(int a, int b) {
		//variables in arguments and inside method are local variable
		int c = 20;
		//System.out.println(c);
		System.out.println(a+b+this.c); // this is used to refer instance variable in a class
	//this can refer the method also and this wont work in static 
	}
	
	public static void main(String[] args) {
		LeranThisAndInstance ol = new LeranThisAndInstance();
		ol.addTwoNumbers(10, 5);

	}

}
