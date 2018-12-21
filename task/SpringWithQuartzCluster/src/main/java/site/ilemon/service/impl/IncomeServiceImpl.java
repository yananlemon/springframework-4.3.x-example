package site.ilemon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import site.ilemon.dao.IncomeDao;
import site.ilemon.service.IIncomeService;

@Service
public class IncomeServiceImpl implements IIncomeService{

	@Autowired
	private IncomeDao dao;
	
	/**
	 * 这里只是为了展示功能，故直接更新所有用户的金额
	 */
	@Override
	public int updateTotalAmt() {
		System.out.println("开始更新收益");
		int rs = dao.updateTotalAmt();
		System.out.println("更新收益结束");
		return rs;
	}

}
