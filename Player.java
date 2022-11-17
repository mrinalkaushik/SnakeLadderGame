package com.bridgelabz.snakeladder;

public class Player {
	/* uc1 rolling dice*/
	public static void rolldice() {
		System.out.println(" roll the dice ");
		double x = Math.floor((Math.random() * 6) + 1);
		System.out.println(" dice number is: " + x);

	}
}
