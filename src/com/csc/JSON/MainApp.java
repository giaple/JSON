package com.csc.JSON;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;


public class MainApp {

	public static void main(String[] args) {
		int countDesign = 0;
		int countReady;
		int countNon;
		int countAuto = 0;
		List<TestCase> listTest = new ArrayList<TestCase>();
		TestCase test1 = new TestCase();
		test1.setStatus("designed");
		test1.setAutomat("auto");
		listTest.add(test1);
			
		TestCase test2 = new TestCase();
		test2.setStatus("ready");
		test2.setAutomat("non");
		listTest.add(test2);
		
		
		TestCase test3 = new TestCase();
		test1.setStatus("designed");
		test1.setAutomat("auto");
		listTest.add(test1);
		
		TestCase test4 = new TestCase();
		test1.setStatus("designed");
		test1.setAutomat("auto");
		listTest.add(test1);
		
		for (int i = 0; i < listTest.size(); i++){
			if("auto".equals(listTest.get(i).getAutomat())){
				countAuto++;
			}
			if("designed".equals(listTest.get(i).getStatus())){
				countDesign++;
			}			
		}
		countReady = listTest.size() - countDesign;
		countNon = listTest.size() - countAuto;
		
		System.out.println("AUTO :" +countAuto);
		System.out.println("NON :" + countNon);
		System.out.println("DESGINE :"+ countDesign);
		System.out.println("READY : "+ countReady);
		
		JSONObject object = new JSONObject();
		object.put("automated", countAuto);
		object.put("manual", countNon);
		object.put("design", countDesign);
		object.put("ready", countReady);
		
		System.out.println(object);
		
		
	}
}
