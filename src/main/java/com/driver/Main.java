package com.driver;

import com.driver.RWOnly;

public class Main {
	public static void main(String[] args) {
		RWOnly r = new RWOnly();
		// System.out.println(r.name("Rahul"));
		// Error: Could not find or load main class
		r.setName("Rahul");
		System.out.println(r.getName());
	}
}