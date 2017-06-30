package com.springFrameWork.AutomaticBeanDecovery;

import org.springframework.stereotype.Component;

@Component("ConsoleWriter")
public class consoleWriter implements LogWriter {

	public void write(String text) {
		System.out.println("ConsoleWriter : " + text);
	}

}
