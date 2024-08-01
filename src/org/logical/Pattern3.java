package org.logical;

public class Pattern3 {
	
	public static void main(String[]args) {
		int i,j,k;
		int p=10;
				
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
