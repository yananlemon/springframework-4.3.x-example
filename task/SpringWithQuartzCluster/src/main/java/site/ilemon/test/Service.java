package site.ilemon.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import site.ilemon.service.IIncomeService;

@Component("service")
public class Service {

	@Autowired
	private IIncomeService service;
	
	public void doSth(){
		this.service.updateTotalAmt();
	}
}
