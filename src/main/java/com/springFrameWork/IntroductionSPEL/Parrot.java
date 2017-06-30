package com.springFrameWork.IntroductionSPEL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Parrot {
	private String id;
	private String speech;

	@Autowired
	public void setSpeech(@Value("#{randomSpeech.getText()}") String speech) {
		this.speech = speech;
	}

	@Autowired
	public void setId(@Value("#{T(Math).sin(6)}") String id) {
		this.id = id;
	}

	public void speak() {
		System.out.println(id + " " + speech + " ");
	}
}
