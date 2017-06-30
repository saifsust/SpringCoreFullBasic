/**
 * 
 */
package com.springFrameWork.AutomaticBeanDecovery;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author SAIF_SUST
 *
 */
public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springFrameWork/AutomaticBeanDecovery/beanConfig.xml");
		Logger logger = (Logger) context.getBean("Logger");
		logger.writeFile("Hello FileWriter : ");
		logger.writeConsole("Hello ConsoleWriter : ");

		System.out.println("Hello Injection ");
		((ClassPathXmlApplicationContext) context).close();

	}

}
