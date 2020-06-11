package com.java.numbers.heera;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// pr0gram to find sum of digits in an integer
		System.out.println("Enter the number: ");
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		int sum = 0;
		while (number != 0) {
			sum = sum + (number % 10);
			number = number / 10;
		}
		scn.close();
		System.out.println("Sum of the digits: "+sum);
	}
}