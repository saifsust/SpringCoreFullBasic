package com.springFrameWork.AutowireAnnotation;

import org.springframework.stereotype.Component;

@Component
public class fileWriter implements LogWriter {

	public void write(String text) {
		System.out.println("FileWriter : " + text);
	}

}
