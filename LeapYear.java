package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		LeapYear obj = new LeapYear();
		obj.leapYear();
	}

	void leapYear() {
		int y;
		System.out.println("Enter a Year");
		Scanner sc = new Scanner(System.in);
		y = sc.nextInt();

		if (y % 100 == 0 && y % 400 == 0 || y % 100 != 0 && y % 40 == 0) {
			System.out.println("Is Leap Year");
		} else {
			System.out.println("Is Not Leap Year");
		}

	}
}
