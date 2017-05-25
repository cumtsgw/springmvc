package com.nickel.callback.f;

public class B {
	public void excute() {
		System.out.println("b method invoking....");
	}

	public void b(A a) {
		System.out.println("b方法被调用");
		a.c();
	}
}
