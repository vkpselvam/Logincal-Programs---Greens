package org.logical;

public class New {
	
	public static void main(String[]args) {
		int n=10;
		int i,j,k;
		
		for(i=1;i<=n;i++) {
			for(k=1;k<=n-i;k++)
			{
				System.out.print(" ");			
			}
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
