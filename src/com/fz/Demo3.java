package com.fz;

public class Demo3 {

	public static void main(String[] args) {
		// (1)������˾������ù�˾��3��Ա����
		Com c = new Com("IBM");
		// (2)���Ա��
		c.add("����", 30);
		c.add(new Emp("����", 40));
		c.add(new Emp("����", 50));
		// (3)�������Ա����Ϣ
		c.printAll();
	}

}
