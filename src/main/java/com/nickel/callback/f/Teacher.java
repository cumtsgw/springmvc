package com.nickel.callback.f;

/**
 * 老师对象，原文出处http://www.cnblogs.com/xrq730/p/6424471.html
 */
public class Teacher implements Callback {

	private Student student;

	public Teacher(Student student) {
		this.student = student;
	}

	public void askQuestion() {
		student.resolveQuestion(this);
		System.out.println("老师问完了");
	}

	public void tellAnswer(int answer) {
		System.out.println("知道了，你的答案是" + answer);
	}
}