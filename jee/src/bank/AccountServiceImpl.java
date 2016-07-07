package bank;

import java.util.List;

/**
 * @date   : 2016. 6. 20.
 * @author : 최인철
 * @file_name : accountServiceImpl.java
 * @story : 계좌 인터페이스
*/
public class AccountServiceImpl implements AccountService {
	AccountDAO dao = AccountDAO.getInstans();
	private static AccountServiceImpl instence = new AccountServiceImpl();
	public static AccountServiceImpl getInstence() {
		return instence;
	}
	private AccountServiceImpl() {}
	
	public String openAccount(AccountBean acc) {
		String result = "";
		
		acc.setAccountNo(accountNo());
		
		if (dao.openAccount(acc) == 1) {
			result = "계좌 개설에 성공하였습니다";
		}else {
			result = "계좌 개설에 실패하였습니다";
		}
		return result;		
	}
    public int accountNo(){
    	int result=0;
    	int accountNo=(int) ((Math.random() * 999999) + 100000);
		if(accountNo > 999999){
			accountNo -= 100000;
			}
     return result;
}
	@Override
	public void deposit(int inputMoney) {
		/*int money =account.getMoney();
		money += inputMoney ;
		account.setMoney(money);*/
		
		return ;
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

	public void showAccount() {
		// TODO Auto-generated method stub
		
	}

	public String deleteAccount(String account) {
		// TODO Auto-generated method stub
		return null;
	}

}