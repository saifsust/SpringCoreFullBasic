package com.springFrameWork.AutomaticBeanDecovery;

import org.springframework.stereotype.Component;

@Component
public interface LogWriter {
	public void write(String text);

}
