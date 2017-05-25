package com.nickel.decoration.window;

public class DecoratedWindowTest {

	public static void main(String[] args) {
		// 这里可以看到原来见到的SimpleWindow就有了HScrollbar和VScrollBar
		Window decoratedWindow = new HScrollBarDecorator(new VScrollBarDecorator(new SimpleWindow()));
		System.out.println(decoratedWindow.getDescription());

		HScrollBarDecorator hWindow = new HScrollBarDecorator(new SimpleWindow());
		VScrollBarDecorator vWindow = new VScrollBarDecorator(hWindow);
		System.out.println(vWindow.getDescription());
	}

}