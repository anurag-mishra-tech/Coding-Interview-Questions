package com.string.programs;

public class ReverseString {
	public static void main(String[] args) {

		String str = "Anurag", nstr = "";
		char ch;

		System.out.println("Original word: "+str);

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i); // extracts each character
			nstr = ch + nstr; // adds each character in front of the existing string
		}
		System.out.println("Reversed word: " + nstr);

	}
}
