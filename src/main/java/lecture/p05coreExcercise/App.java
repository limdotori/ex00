package lecture.p05coreExcercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.log4j.Log4j;

@Log4j
public class App {

public static void main(String[] args) {
	String configLocation = "lecture/p05coreExcercise/context.xml";
	ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
	
	Computer c1 = context.getBean(Computer.class);
//	Memory m1 = context.getBean(Memory.class);
	Memory m1 = (Memory) context.getBean("memory");
	log.warn(c1);
	log.warn(m1);
	
	log.warn(c1.getMemory());
}
}
