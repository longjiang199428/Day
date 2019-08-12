package com.fz;

public class Demo1 {
	private int hour;
	private int minute;
	private int second;

	Demo1() {
	}

	public Demo1(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public void setHour(int hour) {
		if (hour >= 0 && hour <= 24) {
			this.hour = hour;
		} else {
			this.hour = -1;
		}
	}

	public int getHour() {
		return hour;

	}

	public void setHour1(int minute) {
		if (minute >= 0 && minute <= 60) {
			this.minute = minute;
		} else {
			this.minute = -1;
		}
	}

	public int getHour1() {
		return minute;

	}

	public void setHour2(int second) {
		if (second >= 0 && second <= 60) {
			this.second = second;
		} else {
			this.second = -1;
		}
	}

	public int getHour2() {
		return second;

	}

	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}

	public static void main(String[] args) {
		Demo1 d = new Demo1(3, 47, 22);
		System.out.println("现在时间是：" + d);

	}
}
