package com.fz;

public class Emp {
	private String name;
	private int age;

	public String getName() {// ����get����name
		return name;
	}

	public void setName(String name) {// ����set����name
		this.name = name;
	}

	public int getAge() {// ����get����age
		return age;
	}

	public void setAge(int age) {// ����set����age
		this.age = age;
	}

	public Emp(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override // �ǰѵ�ַת���ɸõ�ַ����Ӧ�ı���ֵ��
	public String toString() {
		return name + " " + age;
	}

	public static void main(String[] args) {

	}
}
