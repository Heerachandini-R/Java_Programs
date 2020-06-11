package com.java.numbers.heera;
public class PerfectNumber {
//Perfect Number--> 6-> 1,2,3
	//28--> 1,2,4,7,14
	public static void main(String[] args) {
		int n=6;
		boolean b=isPerfect(n);
		
		if(b) {
			System.out.println("Its is a Perfect Number");
			
		}
		else
			System.out.println("It is not a Perfect Number");

	}

	public static boolean isPerfect(int n) {
	
		int sum=0;
		for(int i=1;i<n;i++)  //for(int i=1;i<n/2;i++) we dont have to go to the last number
			//till half number is only needed to check the factors
			{
			if(n%i==0)
				//sum=sum+i;  --> sum=sum+i;
				sum+=i;
			
			}
		System.out.println("Sum:"+sum);
		if(n==sum)
			return true;
		
		return false;
	}

}
