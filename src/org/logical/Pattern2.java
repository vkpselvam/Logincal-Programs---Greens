package org.logical;

public class Pattern2 {
	public static void main(String[]args) {
		int p=10;
		int i,j;
		for(i=1;i<=p;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
