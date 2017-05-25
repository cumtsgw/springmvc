package com.nickel.decoration.window;

public class SimpleWindow implements Window {
	public void draw() {
		System.out.println("draw window");
	}

	public String getDescription() {
		return "Simple Window";
	}
}