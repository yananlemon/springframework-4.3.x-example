package site.ilemon.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component("simpleScheduleJob")
public class SimpleScheduleJob {

	SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public void doSomething(){
		System.out.println(dataFormat.format(new Date())+"开始执行一个简单的定时任务...");
	}
}
