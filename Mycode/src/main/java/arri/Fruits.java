package arri;

import java.util.Arrays;

public class Fruits {

	public static void main(String[] args) {
		
		String[] fruits = {"Apple", "Orange", "Banana", "Grapes", "Pomegrante", "tomato", "Pineapple"};
		System.out.println(fruits[0]);
		System.out.println(fruits[4]);
		System.out.println(fruits.length);
		System.out.println(fruits[fruits.length-1]);
		System.out.println(Arrays.toString(fruits));
		System.out.println(fruits[-1]);

	}

}
