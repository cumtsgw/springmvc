package com.nickel.callback.d;

public class Student3 {
	private String name = null;

	public Student3(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public class doHomeWork implements DoJob {
		public void fillBlank(int a, int b, int result) {
			System.out.println(name + "求助小红计算:" + a + " + " + b + " = " + result);
		}
	}

	public void callHelp(int a, int b) {
		new SuperCalculator().add(a, b, new doHomeWork());
	}
}