package arri;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		
		//arrays can be declared with object too
		int[] a = new int[4];
		a[0] = 100;
		a[1] = 200;
		System.out.println(Arrays.toString(a));
		
		String[] guns = {"AKM", "AUG", "AWM", "Groza", "M416", "scar-1", "dbs"};
		System.out.println(guns[4]);
		System.out.println(guns[0]);
		System.out.println(guns.length);
		//to get last value
		System.out.println(guns[guns.length-1]);
		//to print all values in array without for loop
		System.out.println(Arrays.toString(guns));
	}

}
