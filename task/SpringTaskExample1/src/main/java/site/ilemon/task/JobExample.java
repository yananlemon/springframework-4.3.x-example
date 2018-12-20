package site.ilemon.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class JobExample {

	SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	@Scheduled(cron = "")
	public void myJob(){
		System.out.println(dataFormat.format(new Date()));
	}
}
