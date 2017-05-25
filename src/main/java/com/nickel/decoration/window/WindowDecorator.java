package com.nickel.decoration.window;

public abstract class WindowDecorator implements Window {
	protected Window decoratedWindow;

	public WindowDecorator(Window decoratedWindow) {
		this.decoratedWindow = decoratedWindow;
	}
}