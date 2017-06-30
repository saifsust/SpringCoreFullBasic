package com.springFrameWork.AutomaticBeanDecovery;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Component;


@Component
public class Logger {

	 //@Inject
	private consoleWriter ConsoleWriter;
	 //@Inject
	private fileWriter FileWriter;

	public void writeConsole(String text) {
		ConsoleWriter.write(text);
	}

	public void writeFile(String text) {
		FileWriter.write(text);
	}

	public consoleWriter getConsoleWriter() {
		return ConsoleWriter;
	}

	public LogWriter getFileWriter() {
		return FileWriter;
	}

	 @Inject
	 @Named(value="ConsoleWriter")
	public void setConsoleWriter(consoleWriter consoleWriter) {
		ConsoleWriter = consoleWriter;
	}

	 @Inject
	 @Named(value="FileWriter")
	public void setFileWriter(fileWriter fileWriter) {
		FileWriter = fileWriter;
	}

}
