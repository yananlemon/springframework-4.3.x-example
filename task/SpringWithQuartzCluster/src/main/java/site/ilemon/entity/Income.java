package site.ilemon.entity;

/**
 * 收益实体类
 * @author andy
 *
 */
public class Income {

	private String name;		// 用户名
	
	private double totalAmt; 	// 累计收益
	
	private double principal;	// 本金
	
	private double rateOfDay;	// 日利率
	
	public Income() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getRateOfDay() {
		return rateOfDay;
	}

	public void setRateOfDay(double rateOfDay) {
		this.rateOfDay = rateOfDay;
	}
}
