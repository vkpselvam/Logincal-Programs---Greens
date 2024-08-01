package org.logical;

public class Concatenation {
	public static void main(String[] args) {

		String s1 = "Java Maven TestNG BDD";
		String s2="ABC";
		String s3="DEF";
		String s4="GHI";
		
		System.out.println(s2.concat(s3).concat(s4));
		
		String[] split = s1.split(" ");

		for (int i = 0; i < split.length; i++) {

			System.out.println(split[i]);

		}
	}

}
