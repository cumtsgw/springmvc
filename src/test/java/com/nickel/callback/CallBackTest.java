package com.nickel.callback;

import org.junit.Test;

import com.nickel.callback.a.Student;
import com.nickel.callback.b.Student1;
import com.nickel.callback.c.Student2;
import com.nickel.callback.d.Seller;
import com.nickel.callback.d.Student3;

public class CallBackTest {

	@Test
	public void cal() {
		int a = 1;
		int b = 1;
		Student s = new Student("小明");
		s.fillBlank(a, b);
	}

	@Test
	public void cal1() {
		int a = 168;
		int b = 291;
		Student1 s = new Student1("小明");
		s.fillBlank(a, b);
	}

	@Test
	public void cal2() {
		int a = 26549;
		int b = 16487;
		Student2 s = new Student2("小明");
		s.callHelp(a, b);
	}

	@Test
	public void cal3() {
		int a = 56;
		int b = 31;
		int c = 26497;
		int d = 11256;
		Student3 s1 = new Student3("小明");
		Seller s2 = new Seller("老婆婆");

		s1.callHelp(a, b);
		s2.callHelp(c, d);
	}
}
