package com.cucumber.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void beforeHook() {
		// TODO Auto-generated method stub
		System.out.println("Before Hook");
	}
	
	@After
	public void afterHook() {
		// TODO Auto-generated method stub
		System.out.println("After Hook");
	}
}
