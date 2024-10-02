package constructor;

public class Learner {
	int a;
	String name;
	boolean c;
	float d;
	double e;
	
	public Learner(int a,String g,boolean h,float i,double j) {
		this.a = a;
		this.name = g;
		this.c = h;
		this.d = i;
		this.e = j;
	}

	/*
	 * public Learner(String g) { this.name = g; }
	 */
	/*
	 * public Learner(boolean h) { this.c = true; }
	 */
	
	
	void display() {
		System.out.println(this.a);
		System.out.println(this.name);
		System.out.println(this.c);
		System.out.println(this.d);
		System.out.println(this.e);
	}


}
