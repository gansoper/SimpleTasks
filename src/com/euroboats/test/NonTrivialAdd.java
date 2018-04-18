package com.euroboats.test;

public class NonTrivialAdd {
	public static void main(String[] args) {
		System.out.println(add(4,6));
		System.out.println(add(14,6));
		System.out.println(add(-4,6));
	}
	
	public static int add(int a, int b){
		if (b==0)
			return a;
		
		int xor = a^b;
		int and = (a&b) <<1;
		
		return add(xor, and);
	}
}
