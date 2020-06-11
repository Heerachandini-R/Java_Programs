package com.java.numbers.heera;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
		System.out.println("Enter the number to check whether it is prime or not:");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("The Number is Even");
		} else {
			System.out.println("The Number is Odd");
		}

	}

}
