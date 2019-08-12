package com.fz;

public class Demo2 {
	public static void main(String[] args) {
		Demo1 d=new Demo1(3,47,22);
		System.out.println("现在时间是："+d);
		d.setHour(-24);
		System.out.println(d.getHour());
		d.setHour1(-60);
		System.out.println(d.getHour1());
		d.setHour2(-60);
		System.out.println(d.getHour2());
	}
}
