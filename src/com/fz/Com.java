package com.fz;

public class Com {
	int i;
	Emp[] arr = new Emp[3];
	private String name;

	public String getNmae() {
		return name;
	}

	public String getName(String name) {
		return this.name = name;
	}

	public Com(String name) {
		this.name = name;
	}

	// ���Ա��
	public void add(String name, int age) {
		Emp e = new Emp(name, age);
		arr[i++] = e;
	}

	public void add(Emp e) {
		arr[i++] = e;
	}

	// �������Ա����Ϣ
	public void printAll() {
		for (Emp emp : arr) {
			System.out.println(emp);
		}
	}
}
