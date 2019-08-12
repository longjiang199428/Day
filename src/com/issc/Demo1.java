package com.issc;

public class Demo1 {
	public static void sum(int a, int b) {
		System.out.println("sum(int ,int):" + (a + b));
	}

	public static void sum(double a, int b) {
		System.out.println("sum(double ,int):" + (a + b));
	}

	public static String sum(double a, int b, double c) {
		return "sum(double ,int,double):" + (a + b + c);
	}

	public static void main(String[] args) {
		sum(2, 5);
		sum(3.2, 2);
		System.out.println(sum(2.2, 3, 3.2));

	}

}
