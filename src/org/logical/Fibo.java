package org.logical;

public class Fibo {
	public static void main(String[]args) {
		int fibo=15;
		int n1=0;
		int n2=1;
		int n3;
		System.out.println("Fibonacci series for: "+fibo);
		
		for(int i=0;i<=fibo;i++) {
			System.out.println(n1);
			n3=n1+n2;
			n1=n2;
			n2=n3;
		
		}
	}

}
