package com.sbr.homework;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionPrintMethodNames implements Cloneable { // Marker Interfaces

	public static void main(String[] args) {

		try {
			process("com.sbr.homework.GoogleSearchThreeResultsTestCase"); // give classname alongwith pakage..
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// This is called reflection. We used Java reflection API.
	public static void process(String className) throws ClassNotFoundException {
		Class aClass = Class.forName(className);

		// Get the methods
		Method[] methods = aClass.getDeclaredMethods();

		// Loop through the methods and print out their names
		for (Method method : methods) {
			System.out.println(method.getName());
			try {
				Object returnValue = method.invoke(aClass, "parameter-value1");
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// Assertions.. We loop through the list and compare against expected method
		// names.

		// Then, we can write negative test case. ClassName wrong given. No such class
		// available. We can expect exception.. ClassNotFoundException

		// Known class and check for method which is not there... Obviously it fails..
		// It is not giving wrong data..

		// OK . Class can not be instantiated. Constructor fails..

		// Class loading scenario.. It is loading from a different Jar..
		// It has different methods.. Obviously different classs..
		// role..
	}

}
