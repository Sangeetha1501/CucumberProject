package com.amazon.am_helper;

import java.util.HashMap;
import java.util.Map;

import com.enums.Context;

public class ScenarioContext {
	
	public Map<String, Object> scenarioContext;
	
	public ScenarioContext() {
	  scenarioContext = new HashMap <String, Object>();	
	}
	
	public static ScenarioContext sc = new ScenarioContext();
	
	public static ScenarioContext Instance() {
		return sc;
	}
	
	public void setContext(Context key, Object value) {
		scenarioContext.put(key.toString(), value);
	}
	
	public Object getContext(Context Key) {
		return scenarioContext.get(Key.toString());
	}
	
	public Boolean isKeyEmpty(Context Key) {
		return scenarioContext.containsKey(Key.toString());
		
	}
	
 

}
