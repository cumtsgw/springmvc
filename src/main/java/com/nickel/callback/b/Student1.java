package com.nickel.callback.b;

public class Student1 {
	
	private String name = null;

	public Student1(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int calcADD(int a, int b) {
		return a + b;
	}

	private int useCalculator(int a, int b) {
		return new Calculator().add(a, b);
	}

	public void fillBlank(int a, int b) {
		int result = useCalculator(a, b);
		System.out.println(name + "使用计算器:" + a + " + " + b + " = " + result);
	}
}