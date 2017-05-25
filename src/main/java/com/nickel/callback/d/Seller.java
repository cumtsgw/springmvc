package com.nickel.callback.d;

public class Seller {
	private String name = null;

	public Seller(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public class doHomeWork implements DoJob {
		public void fillBlank(int a, int b, int result) {
			System.out.println(name + "求助小红算账:" + a + " + " + b + " = " + result + "元");
		}

	}

	public void callHelp(int a, int b) {
		new SuperCalculator().add(a, b, new doHomeWork());
	}
}