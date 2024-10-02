package methods2;

public class MyMobile {

	public static void main(String[] args) {
		
		Mobile om = new Mobile();
		om.makeCall(948);
		om.makeCall("Thamizh");
		boolean re = om.RecivedCall();
		System.out.println(re);
		

	}
 
}
