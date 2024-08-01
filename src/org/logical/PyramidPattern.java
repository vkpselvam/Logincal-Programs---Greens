package org.logical;

public class PyramidPattern {

	public static void main(String[]args) {
		int p=5;
		int i,j,k;
		
		for(i=1;i<=p;i++) {
			for(k=1;k<=p-i;k++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
