package org.logical;
import java.util.Scanner;

public class Factoria {
	public static void main(String[]args) {
		int fact=1;
		System.out.println("Enter the value");
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factoial of "+n+" is "+fact);
	}
}
