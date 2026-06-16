package com.process.strings;

public class TraditionalForLoopMethod {
	public static void main(String[] args) {
		String str = "Chakri";
		
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			System.out.println(ch);			
		}
	}
}
