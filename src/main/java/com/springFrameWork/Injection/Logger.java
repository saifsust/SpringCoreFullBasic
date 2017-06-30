package com.springFrameWork.Injection;

import javax.inject.Inject;

import com.springFrameWork.AutowireAnnotation.consoleWriter;
import com.springFrameWork.AutowireAnnotation.fileWriter;

public class Logger {

	//@Inject
	private consoleWriter ConsoleWriter;
	//@Inject
	private fileWriter FileWriter;

	
	
	public Logger() {
	}

	@Inject
	public Logger(consoleWriter consoleWriter, fileWriter fileWriter) {
		ConsoleWriter = consoleWriter;
		FileWriter = fileWriter;
	}

	public void writeConsole(String text) {
		ConsoleWriter.write(text);
	}

	public void writeFile(String text) {
		FileWriter.write(text);
	}

	public consoleWriter getConsoleWriter() {
		return ConsoleWriter;
	}

	//@Inject
	public void setConsoleWriter(consoleWriter consoleWriter) {
		ConsoleWriter = consoleWriter;
	}

	public fileWriter getFileWriter() {
		return FileWriter;
	}

	//@Inject
	public void setFileWriter(fileWriter fileWriter) {
		FileWriter = fileWriter;
	}

}
