package com.strings.process;

public class CharAtMethod {
	public static void main(String[] args) {
		String str = "Hello..!";
		
		//equals length - 1
		for(int i = 0; i<=str.length()-1; i++) {
			System.out.println(str.charAt(i));
		}
		
		System.out.println("****************");
		//direct check length - 1
		//both will work
		for(int i = 0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
}
