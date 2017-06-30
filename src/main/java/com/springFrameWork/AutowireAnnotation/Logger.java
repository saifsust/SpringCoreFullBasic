package com.springFrameWork.AutowireAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Logger {
	// @Autowired
	private consoleWriter ConsoleWriter;
	// @Autowired
	private fileWriter FileWriter;

	public Logger() {
	}

	// @Autowired
	public Logger(consoleWriter consoleWriter, fileWriter fileWriter) {
		ConsoleWriter = consoleWriter;
		FileWriter = fileWriter;
	}

	@Autowired
	public void setConsoleWriter(consoleWriter consoleWriter) {
		ConsoleWriter = consoleWriter;
	}

	@Autowired
	public void setFileWriter(fileWriter fileWriter) {
		FileWriter = fileWriter;
	}

	public consoleWriter getConsoleWriter() {
		return ConsoleWriter;
	}

	public fileWriter getFileWriter() {
		return FileWriter;
	}

	public void writeFile(String text) {
		this.FileWriter.write(text);
	}

	public void writeConsole(String text) {
		this.ConsoleWriter.write(text);
	}

}
