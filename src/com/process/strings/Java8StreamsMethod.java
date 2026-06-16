package com.process.strings;

public class Java8StreamsMethod {
	public static void main(String[] args) {
		String str = "Gayatri";
		
		str.chars().forEach(ch->System.out.println((char) ch));
	}
}
