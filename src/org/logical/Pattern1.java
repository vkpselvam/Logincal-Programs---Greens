package org.logical;

public class Pattern1 {
	public static void main(String[]args) {
		int p=10;
		int i,j;
		for(i=1;i<=p;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
