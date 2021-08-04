package com.greatlearning.functions;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.Check for palindrome number\n"
					+ "2.Prints the pattern of stars in decreasing order based on the input\n"
					+ "3.Check whether the input number is a prime number\n"
					+ "4.Print Fibonacci series of size n with first two numbers as 0, 1\n"
					+ "5.Exit Program\n" + "Enter Option Number: ");
			int option = sc.nextInt();
			switch(option) {
			case 1:
				Functions obj =new Functions();
				System.out.println("Enter a Number :  ");
				obj.number=sc.nextInt();
				System.out.println(obj.Pallindromee());
				System.out.println();
				break;
			case 2:
				Functions obj1 =new Functions();
				System.out.println("Enter a Number :  ");
				obj1.number=sc.nextInt();
				obj1.Pattern();
				System.out.println();
				break;
			case 3:
				Functions obj2 =new Functions();
				System.out.println("Enter a Number :  ");
				obj2.number=sc.nextInt();
				System.out.println(obj2.Prime());
				System.out.println();
				break;
			case 4:
				Functions obj3 =new Functions();
				System.out.println("Enter a Number :  ");
				obj3.number=sc.nextInt();
				obj3.Fibonacci();
				System.out.println();
				break;
			case 5:
				System.exit(1);
			default:
				System.out.println("Invalid choice. Enter a valid no.\n");			
			}	
		}while(true);
	}

}
