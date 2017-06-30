/**
 * 
 */
package com.springFrameWork.AutowireAnnotation;

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
				"com/springFrameWork/AutowireAnnotation/AnnotationBeans.xml");

		Logger logger = (Logger) context.getBean("Logger");

		logger.writeConsole("Hello Console  ");
		logger.writeFile("Hello File  ");
		System.out.println("Hello Autowired Annotation ");
		((ClassPathXmlApplicationContext) context).close();

	}

}
