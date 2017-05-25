package com.nickel.decoration.window;

//修饰类的一个子类。为window类增加了新的方法 drawVScrollBar.  
public class VScrollBarDecorator extends WindowDecorator {

	public VScrollBarDecorator(Window decoratedWindow) {
		super(decoratedWindow);
	}

	// 这里可以看到window的功能方便的被扩展了，调用decoratedWindow.draw之前还可以增加其他的功能。并且在使用该方法的时候，才会去实例化window和decoratedWindow
	public void draw() {
		drawVScrollBar();
		decoratedWindow.draw();
	}

	private void drawVScrollBar() {

	}

	public String getDescription() {
		return decoratedWindow.getDescription() + "-- include vscorllbar";
	}

}