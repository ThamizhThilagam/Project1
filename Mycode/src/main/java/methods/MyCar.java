package methods;

public class MyCar {

	public static void main(String[] args) {
		 Car oc = new Car();
		 oc.cname = "Toyata";
		 oc.cprice = "100000";
		 oc.carName();
		 boolean start = oc.carStarted();
		 System.out.println(start);
		 String price = oc.carPrice();
		 System.out.println(price);

	}

}
