package com.springFrameWork.AutomaticBeanDecovery;

import org.springframework.stereotype.Component;

@Component("FileWriter")
public class fileWriter implements LogWriter {

	public void write(String text) {
		System.out.println("FileWriter : " + text);
	}

}
