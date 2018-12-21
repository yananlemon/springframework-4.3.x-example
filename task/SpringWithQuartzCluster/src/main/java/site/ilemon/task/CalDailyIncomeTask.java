package site.ilemon.task;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import site.ilemon.test.Service;

/**
 * 计算每日收益定时任务
 * @author andy
 *
 */
public class CalDailyIncomeTask extends QuartzJobBean{

	private Service service;
	
	public void setService(Service service) {
		this.service = service;
	}


	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		service.doSth();
	}

}
