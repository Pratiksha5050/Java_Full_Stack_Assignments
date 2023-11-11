package springHelloWorld;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class App 
{


	public static void main(String[] args)
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beansFile.xml");
		Employee emp =(Employee)ctx.getBean("emp1");
		System.out.println(emp);
	}
}
