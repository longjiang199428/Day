package com.issc;

public class Demo2 {
	String name;
	int age;
	String sex;

	public Demo2() {

	}

	public Demo2(String name) {
		this.name = name;
	}

	public Demo2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Demo2(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public static void main(String[] args) {
		Demo2 a = new Demo2();
		a.name = "aa";
		System.out.println(a.name);
		Demo2 b = new Demo2();
		a.age = 20;
		System.out.println(a.age);
		Demo2 f = new Demo2("aa", 12, "bb");
		System.out.println(f.name + "  " + f.age + "  " + f.sex);

		System.out.println(a);
	}

}
