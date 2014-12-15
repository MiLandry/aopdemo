package aopspringdemo;

import model.Triangle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("hello, aop");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) ctx.getBean("triangle");
        
        triangle.draw();


        

    }

}
