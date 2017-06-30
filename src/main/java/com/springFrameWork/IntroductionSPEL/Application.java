/**
 * 
 */
package com.springFrameWork.IntroductionSPEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author SAIF_SUST
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springFrameWork/IntroductionSPEL/beanConfig.xml");
		
			Parrot part = (Parrot) context.getBean("parrot");
			part.speak();
		((ClassPathXmlApplicationContext) context).close();

	}

}
