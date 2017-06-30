package com.springFrameWork.PropertyFile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Parrot {
	private String id="123", speech="hi here";

	
	public String getId() {
		return id;
	}

	@Autowired
	public void setId(@Value("${jdbc.user}")String id) {
		this.id = id;
	}

	public String getSpeech() {
		return speech;
	}

	@Autowired
	public void setSpeech(@Value("${jdbc.password}") String speech) {
		this.speech = speech;
	}

	public void speak() {

		System.out.println(id + "  " + speech);
	}

}
