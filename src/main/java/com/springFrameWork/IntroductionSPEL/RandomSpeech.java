package com.springFrameWork.IntroductionSPEL;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomSpeech {
	private String[] text = { "Hi Saiful", "Liton", "Hello Shohel", "Hye Mia", null };

	public String getText() {
		Random random = new Random();
		return text[random.nextInt(text.length)];
	}

}
