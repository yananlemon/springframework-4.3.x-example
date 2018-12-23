package site.ilemon.test;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import site.ilemon.service.IIncomeService;

@Component("service")
public class Service implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1528716619256407967L;
	@Autowired
	private IIncomeService service;
	
	public void doSth(){
		this.service.updateTotalAmt();
	}
}
