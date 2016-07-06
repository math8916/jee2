/**
 * 
 */
package bank;

import java.util.List;

/**
 * @date : 2016. 6. 20.
 * @author : 최인철
 * @file_name : Accountservice.java
 * @story :
 */
public interface AccountService {
	// 1.개설 2.입금 3.조회 4.출금 5.통장내역
	// 1.개설
	public abstract void openAccount(String name, String id, String pw);

	// 2.입금
	public void deposit(int inputMoney);

	// 3.출금
	public String withdraw(int output);

	// 4. UPDATE
		public String updateAccount(AccountBean bean);	
	// 5.해지
	public String deleteAccount();

	// list.add(bean);
	// READ 6.조회 (전체 리스트)
	public List<AccountBean> list();

	// READ 7.계좌번호
	public AccountBean findByAccountNo(String account);

	// REWAD8 . 조회(이름)
	public List<AccountBean> findByName(String name);

	// READ 9. 조회(전체통장수)
	public int count();

	// public String withdraw(int output);
	

}
