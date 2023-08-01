package hu.team;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Program {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		One one=(One)factory.getBean("onebean");
		one.displayInfo();
		
		System.out.println();
		
		Two two=(Two)factory.getBean("twobean");
		two.displayInfo();
	}
}
