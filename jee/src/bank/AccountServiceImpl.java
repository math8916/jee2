package bank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @date   : 2016. 6. 20.
 * @author : 최인철
 * @file_name : accountServiceImpl.java
 * @story : 계좌 인터페이스
*/
public class AccountServiceImpl implements AccountService {
	AccountDAO dao = AccountDAO.getInstans();
	Map<?,?> map ;
	private static AccountServiceImpl instance = new AccountServiceImpl();
	public static AccountServiceImpl getInstence() {
		return instance;
	}
	private AccountServiceImpl() {
		map= new HashMap<String, AccountMemberBean>();
	}
	
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
    	int accountNo=(int) ((Math.random() * 999999) + 100000);
		if(accountNo > 999999){
			accountNo -= 10000;
		}
		return accountNo;
    }
	@Override
	public String deposit(AccountBean acc1) {
		/*int money =account.getMoney();
		money += inputMoney ;
		account.setMoney(money);*/
		
		return String.valueOf(dao.deposit(acc1)) ;
	}

	@Override
	public String withdraw(AccountBean acc2) {
		// TODO Auto-generated method stub
		return String.valueOf(dao.withdraw(acc2));
	}

	@Override
	public String updateAccount(AccountBean acc3) {
		// TODO Auto-generated method stub
		return String.valueOf(dao.updateAccount(acc3));
	}

	@Override
	public String deleteAccount(String delete) {
		
		return String.valueOf(dao.deleteAccount(delete));
	}

	@Override
	public List<?> list() {
		List<?> list = dao.selectAll();
		return list;
	}

	@Override
	public AccountMemberBean findByAccountNo(int account) {
	
		return dao.findByAccountNo(account);
	}

	@Override
	public List<?> findBy(String name) {
		
		return dao.findByName(name);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return dao.count();
	}

	public void showAccount() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Map<?,?> map() {
	map = new HashMap<String,AccountMemberBean>();// controller 넘어가지 않는다 
	map = dao.selectMap();// controller 넘어가지 않는다 
		return map;
	}
	


}