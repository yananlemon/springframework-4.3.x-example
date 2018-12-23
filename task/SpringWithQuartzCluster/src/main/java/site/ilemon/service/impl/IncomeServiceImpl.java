package site.ilemon.service.impl;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.quartz.DisallowConcurrentExecution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import site.ilemon.dao.IncomeDao;
import site.ilemon.service.IIncomeService;

@Service
@DisallowConcurrentExecution
public class IncomeServiceImpl implements IIncomeService ,Serializable{

	private static Logger logger = Logger.getLogger(IncomeServiceImpl.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = -4768106617997270899L;
	//@Autowired
	//private IncomeDao dao;
	
	/**
	 * 这里只是为了展示功能，故直接更新所有用户的金额
	 */
	@Override
	public int updateTotalAmt() {
		logger.info("开始执行定时任务");
		//int rs = dao.updateTotalAmt();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		logger.info("定时任务执行完毕");
		return 0;
	}

}
