package variables;

public class MyLearnThis {
	//There is no need to set value for an instance variable, it be done through constructor
	int a = 5;
	int b = 10;
	public int multiply() {
		int a = 2;
		int b = 5;
		int c;
		System.out.println(c=a*b);
return c;
	}
	public int multiply2() {
		int a = 3;
		int b = 4;
		int c;
		System.out.println(c = this.a*this.b);
		this.multiply();
		return c;
	
	}

	public static void main(String[] args) {
		MyLearnThis omy = new MyLearnThis();
		omy.multiply();
		omy.multiply2();
	
	}

}
