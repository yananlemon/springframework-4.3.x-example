package site.ilemon.task;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class ComplexScheduleJob extends QuartzJobBean{

	private MyService service;
	
	public void setService(MyService service) {
		this.service = service;
	}

	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		service.doSomething();
	}

}
