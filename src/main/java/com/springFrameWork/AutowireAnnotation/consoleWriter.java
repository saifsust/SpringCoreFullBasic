package com.springFrameWork.AutowireAnnotation;

import org.springframework.stereotype.Component;

@Component
public class consoleWriter implements LogWriter {

	public void write(String text) {
		System.out.println("ConsoleWriter : " + text);
	}

}
