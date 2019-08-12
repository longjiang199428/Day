package com.fz;

public class Demo3 {

	public static void main(String[] args) {
		// (1)创建公司（假设该公司有3名员工）
		Com c = new Com("IBM");
		// (2)添加员工
		c.add("张三", 30);
		c.add(new Emp("李四", 40));
		c.add(new Emp("王五", 50));
		// (3)输出所有员工信息
		c.printAll();
	}

}
