package com.fz;

public class Emp {
	private String name;
	private int age;

	public String getName() {// 创建get访问name
		return name;
	}

	public void setName(String name) {// 创建set访问name
		this.name = name;
	}

	public int getAge() {// 创建get访问age
		return age;
	}

	public void setAge(int age) {// 创建set访问age
		this.age = age;
	}

	public Emp(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override // 是把地址转换成该地址所对应的变量值。
	public String toString() {
		return name + " " + age;
	}

	public static void main(String[] args) {

	}
}
