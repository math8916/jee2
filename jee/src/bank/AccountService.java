/**
 * 
 */
package bank;

import java.util.List;
import java.util.Map;

import global.CommonService;

/**
 * @date : 2016. 6. 20.
 * @author : 최인철
 * @file_name : Accountservice.java
 * @story :
 */
public interface AccountService extends CommonService {
	// 1.개설 2.입금 3.조회 4.출금 5.통장내역
	// 1.개설
	public String openAccount(AccountBean acc);

	// 2.입금
	public String deposit(AccountBean acc1);

	// 3.출금
	public String withdraw(AccountBean acc2);

	// 4. UPDATE
	public String updateAccount(AccountBean bean);

	// 5.해지
	public String deleteAccount(String delete);

	// list.add(bean);
	// READ 6.조회 (전체 리스트)
	// public List<?> list();
	// public Map<?,?>map();
	// public Map<>;

	// READ 7.계좌번호
	public AccountMemberBean findByAccountNo(int account);

	// REWAD8 . 조회(이름)
	// public List<?> findByName(String name);

	// READ 9. 조회(전체통장수)
	// public int count();

	/**
	 * @param id
	 */

	// public String withdraw(int output);
	// 원래 요구 사항외 필요 메소드
	// public int restMoney(int accNo){
	// return dao.selectMoney(accNo);
	// }

}
