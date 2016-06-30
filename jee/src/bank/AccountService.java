/**
 * 
 */
package bank;

/**
 * @date   : 2016. 6. 20.
 * @author : 최인철
 * @file_name : Accountservice.java
 * @story : 
*/
public interface AccountService {
	// 1.개설 2.입금 3.조회 4.출금 5.통장내역
		// 1.개설
		public abstract void openAccount(String name,String id, String pw);
		
		// 2.입금
		public void deposit(int inputMoney);	
		
		// 3.조회
		public void findAccount() ;
		// 4.출금
		public  String withdraw(int output);
		//5.통장내역
		public String showAccount() ;
		
		// 6.해지
		public String deleteAccount();	
		
		
	}


