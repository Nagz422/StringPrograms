package com.strings.reverse;

public class StrReverseUsingForLoop {
	public static void main(String[] args) {
		String str = "Nagendra Prasad";
		String rev = "";
				
		for(int i=str.length()-1; i>=0;i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev);
		
		//Using StringBuilder with for loop
		StringBuilder rev2 = new StringBuilder();
		for(int i=rev.length()-1; i>=0;i--) {
			rev2.append(rev.charAt(i));
		}
		System.out.println(rev2);
		
		//Using StringBuffer with for loop
		StringBuffer rev3 = new StringBuffer();
		for(int i=rev2.length()-1; i>=0; i--) {
			rev3.append(rev2.charAt(i));
		}
		System.out.println(rev3);
	}
}
