package com.nickel.decoration.food;

/**
 * 鸭肉
 * 
 * @author xinye
 *
 */
public class Duck extends Food {
	public Duck() {
		desc = "鸭肉";
	}

	@Override
	public String getDesc() {
		return desc;
	}

}