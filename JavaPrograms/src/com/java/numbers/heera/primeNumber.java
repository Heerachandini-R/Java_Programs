package com.java.numbers.heera;
import java.util.Scanner;

public class primeNumber {
	public static void main(String[] args) {
		boolean isPrime = true;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(num + " is a Prime Number");
		} else
			System.out.println(num + " is Not a Prime Number");
	}
}
