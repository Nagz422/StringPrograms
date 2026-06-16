package com.strings.process;

public class ToCharArrayMethod {
	public static void main(String[] args) {
		String str = "Nagendra";
		char[] strArray = str.toCharArray();
		for(int i = 0; i<strArray.length; i++)
		{
			System.out.println(strArray[i]);
		}
		
		System.out.println("***********");
		for(int i=0;i<=strArray.length-1;i++) {
			System.out.println(strArray[i]);
		}
		
		System.out.println("***********");
		for(char chArray:strArray) {
			System.out.println(chArray);
		}
	}
}
