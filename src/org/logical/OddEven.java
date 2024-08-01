package org.logical;

import java.util.Scanner;

public class OddEven {

	public static void main(String[]args) {
		
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		
		if(n%2==0) {
			System.out.println("Given number is: "+n+" Even number");
		}
		else
			System.out.println("Given number is: "+n+" Odd number");
	}
}
