package com.strings.reverse;

public class StrBufferMethod {
	public static void main(String[] args) {
		String str = "Haritha";
		
		String reverse = new StringBuffer(str).reverse().toString();
		System.out.println(reverse);
	}
}
