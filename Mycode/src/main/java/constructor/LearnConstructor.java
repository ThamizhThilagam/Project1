package constructor;

public class LearnConstructor {
	
	
	private LearnConstructor(int x) {
		this.x = x;
	}
	public LearnConstructor(String s) {
		this.name = s;
	}
	int x;
	String name;
	
	/*
	 * public LearnConstructor() { this.x = 100; this.name = "Thamizh"; }
	 */
	
	void display() {
		System.out.println(x+ "--> "+name);
	}

	public static void main(String[] args) {
		LearnConstructor lc = new LearnConstructor(1000);
		lc.display();
		LearnConstructor lc1 = new LearnConstructor("Thamizh");
		lc1.display();
	}

}
