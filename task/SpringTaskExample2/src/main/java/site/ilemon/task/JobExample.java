package site.ilemon.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component("myJob")
public class JobExample {

	SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public void myJob(){
		System.out.println(dataFormat.format(new Date()));
	}
}
