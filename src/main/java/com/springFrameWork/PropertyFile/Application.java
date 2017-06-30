/**
 * 
 */
package com.springFrameWork.PropertyFile;

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
				"com/springFrameWork/PropertyFile/beanConfig.xml");
		Parrot parrot = (Parrot) context.getBean("parrot");
		parrot.speak();

		((ClassPathXmlApplicationContext) context).close();

	}

}
