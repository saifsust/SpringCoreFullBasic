package com.springFrameWork.PropertyWithAnnotation;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class parrot {
	private int id = 0;
	private String speech = "Don't feel like";


	@Inject
	//@Autowired
	public void setSpeech(@Value("SAIFUL")String speech) {
		this.speech = speech;
	}


	@Autowired
	public void setId(@Value("1234")int id) {
		this.id = id;
	}
   

	public void speak() {
		System.out.println(id+"  "+speech+"  ");
	}

}
