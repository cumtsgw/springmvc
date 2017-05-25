package com.nickel.callback.f;

import org.junit.Test;

public class CallBackTest {

	/**
	 * 同步方法调用
	 * 
	 * A方法调用B方法，只有B方法执行完之后，A才继续执行
	 */
	@Test
	public void invoke() {
		B b = new B();
		A a = new A(b);
		a.excute();
	}

	@Test
	public void callback() {
		B b = new B();
		A a = new A(b);
		a.a();
	}

	@Test
	public void callback1() {
		Student student = new Ricky();
		Teacher teacher = new Teacher(student);
		// 回调涉及两个类，三个方法，关系如下：A类调用a方法，在a方法执行时调用了B类的b方法，b方法执行过程中又调用A类c方法
		teacher.askQuestion();
	}

	@Test
	public void callback2() {
		Student student = new Ricky();
		student.resolveQuestion(new Callback() {
			public void tellAnswer(int answer) {
				System.out.println("你的答案是" + answer);
			}
		});
	}
}
