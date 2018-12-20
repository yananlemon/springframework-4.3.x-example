package site.ilemon.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import site.ilemon.task.TaskExecutorExample;

public class AppTest 
{
   
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        TaskExecutorExample taskBean = (TaskExecutorExample) act.getBean("taskExecutorExample");
        taskBean.printMessage();
    }
}
