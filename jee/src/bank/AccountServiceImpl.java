package bank;

/**
 * @date   : 2016. 6. 20.
 * @author : 최인철
 * @file_name : accountServiceImpl.java
 * @story : 계좌 인터페이스
*/
public class AccountServiceImpl implements AccountService {

	AccountBean account ;
	//1. 개설
	public void openAccount(String name, String id, String pw) {
		// TODO Auto-generated method stub
		
		account = new AccountBean(name,id,pw);
	}

	/* (non-Javadoc)
	 * @see bank.Accountservice#deposit(int)
	 */
	// 2. 입금
	public void deposit(int inputMoney) {
		// TODO Auto-generated method stub
			int money =account.getMoney();
			money += inputMoney ;
			account.setMoney(money);

	}
	/* (non-Javadoc)
	 * @see bank.Accountservice#findAccount()
	 */
	@Override
	// 3. 조회
	public void findAccount() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see bank.Accountservice#withdraw(int)
	 */
	@Override
	// 4. 출금
	public String withdraw(int output) {
		// TODO Auto-generated method stub
		String result ="잔액 부족" ;
		int money =account.getMoney();
		if (output <= money) {
			money -=output;	
			account.setMoney(money);
			result = String.valueOf(account.getMoney());
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see bank.Accountservice#showAccount()
	 */
	@Override
	//5 통장 내역
	public String showAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see bank.Accountservice#deleteAccount()
	 */
	@Override
	//6. 해지
	public String deleteAccount() {
		account = null;	
		return "해지";
		// TODO Auto-generated method stub
	}

}
