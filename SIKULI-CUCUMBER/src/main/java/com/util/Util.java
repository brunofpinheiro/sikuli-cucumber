package com.util;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Util {
	
	
	public static void open() {
		Screen s = new Screen();
		try {
			//Closes the calculator if already opened
			if (Runtime.getRuntime().exec("calc") != null) {
				App.close("Calculator.exe");
			}
			
			//Opens the calculator
			Runtime.getRuntime().exec("calc");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}