package com.nickel.decoration.window;

//另外一个增加了功能那个的类  
public class HScrollBarDecorator extends WindowDecorator {

	public HScrollBarDecorator(Window decoratedWindow) {
		super(decoratedWindow);
	}

	public void draw() {
		drawHScrollBar();
		decoratedWindow.draw();
	}

	private void drawHScrollBar() {
	}

	public String getDescription() {
		return decoratedWindow.getDescription() + "--include hscrollbar";
	}
}