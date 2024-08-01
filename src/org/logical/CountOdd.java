package org.logical;
import java.util.Scanner;

public class CountOdd {

	public static void main(String[]args) {
		System.out.println("Enter the Value");
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				count=count+1;
			}
		}System.out.println("Count of Odd Numbers: "+ count);
	}
}
