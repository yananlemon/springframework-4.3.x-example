package site.ilemon.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface IncomeDao {

	/**
	 * 修改所有用户收益
	 * @return
	 */
	public int updateTotalAmt();
}
