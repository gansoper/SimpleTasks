package com.euroboats.test;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverse("Test"));
		System.out.println(reverse("This is a test"));
		System.out.println(reverse("WEPANICINAPEW"));
	}
	
	public static String reverse(String s){
		char[] in = s.toCharArray();
		char[] out = new char[in.length];
		int start = 0;
		int end = in.length -1;
		while(end>=start){
			out[start]  = in[end];
			out[end] = in[start];
			end--;
			start++;
		}
		
		return new String(out);
	}
		
}
