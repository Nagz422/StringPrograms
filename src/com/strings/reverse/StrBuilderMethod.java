package com.strings.reverse;

public class StrBuilderMethod {
	public static void main(String[] args) {
		String str = "Nagendra";
		
		String revers = new StringBuilder(str).reverse().toString();
		
		System.out.println(revers);
	}
}
