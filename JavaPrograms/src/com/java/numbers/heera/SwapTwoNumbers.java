package com.java.numbers.heera;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// Swaping of two numbers with using a third variable
		int x = 25;
		int y = 50;
		System.out.println("Numbers after swaping: " + "x=" + x + " y=" + y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("Numbers after swaping: " + "x=" + x + " y=" + y);
	}
}