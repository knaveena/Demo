package com.java.practice;

public class Woohoo {
	int num = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 2;
		int b = 4;
		double a1 = 3.1;
		double b1 = 3.15;
		int result1 = minFunction(a, b);
		double result2 = minFunction(a1, b1);

		System.out.println("The min int vale is: " + result1);
		System.out.println("The min double value is: " + result2);

		Woohoo obj1 = new Woohoo();
		obj1.print();
		Woohoo obj2 = new Woohoo(25);
		obj2.print();

		printMax(2, 1, 4.2, 2.4, 4.2, 1, 0, 2, 10.5);
		printMax(new double[] { 4.6, 1.2, 5.5, 5.5 });
		
		System.out.println("Just to trigger a build");

	}

	public static int minFunction(int n1, int n2) {
		int min;
		if (n1 > n2)
			min = n2;
		else
			min = n1;
		return min;
	}

	public static double minFunction(double n1, double n2) {
		double min;
		if (n1 > n2)
			min = n2;
		else
			min = n1;
		return min;
	}

	Woohoo() {
		System.out.println("Hello");
	}

	Woohoo(int num) {
		this();
		this.num = num;
	}

	public void greet() {
		System.out.println("Hello Again");
	}

	public void print() {
		int num = 20;

		System.out.println("The local variable is: " + num);

		System.out.println("The instance variable is: " + this.num);

		this.greet();
	}

	public static void printMax(double... numbers) {
		if (numbers.length == 0)
			System.out.println("No argument passed");
		else
			System.out.println("The no. of arguments: " + numbers.length);

		double r = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > r) {
				r = numbers[i];
			}

		}
		System.out.println("The max value is: " + r);

	}
	
}
