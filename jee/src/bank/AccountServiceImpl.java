package bank;

import java.util.List;

/**
 * @date   : 2016. 6. 20.
 * @author : 최인철
 * @file_name : accountServiceImpl.java
 * @story : 계좌 인터페이스
*/
public class AccountServiceImpl implements AccountService {

	@Override
	public void openAccount(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(int inputMoney) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String withdraw(int output) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateAccount(AccountBean bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountBean> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean findByAccountNo(String account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountBean> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void showAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String deleteAccount(String account) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return
	 */
	public static AccountService getInstane() {
		// TODO Auto-generated method stub
		return null;
	}

}