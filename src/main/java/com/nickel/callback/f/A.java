package com.nickel.callback.f;

public class A {

	private B b;

	A(B b) {
		this.b = b;
	}

	// 直接调用
	public void excute() {
		b.excute();
		System.out.println("a method invoking....");
	}

	public void a() {
		System.out.println("a方法调用。。");
		b.b(this);
	}

	public void c() {
		System.out.println("this is callback method!");
	}
}
