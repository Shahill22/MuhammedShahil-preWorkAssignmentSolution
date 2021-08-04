package com.greatlearning.functions;

public class Functions {
	int number;
	public String Pallindromee() {
		int temp=number;	
		int sum=0;
		int re;
		while(number>0) {
			re=number%10;
			sum=(sum*10)+re;
			number=number/10;
		}
		if (sum==temp) {
			return "Pallindrome";
		}
		else {
			return "Not Pallindrome";
		}
	}
	public void Pattern() {
		for (int i=0;i<number;i++) {
			for(int j=0;j<number-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public String Prime() {
		int i=1;
		int count=0;
		while(i<=number){
			if (number%i!=0){
				i++;
			}
			else {
				count++;
				i++;
			}
		}
		if(count==2) {
			return "prime";
		}
		else {
			return "Not Prime";
		}
	}
	public void Fibonacci(){
		int first =0;
		int second =1;
		int count=2;
		int third;
		if(number>=2){
			System.out.print(first+", "+second);
			while(count<number) {
				third = first + second;
				System.out.print(", "+third);
				count++;
				first=second;
				second=third;
			}
		}
		else {
			System.out.println(first);
		}
		System.out.println();
	}
}
