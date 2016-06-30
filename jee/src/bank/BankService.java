package bank;

import java.util.List;

public interface BankService {
	// CREAT 11.개설
			public abstract void openAccount(AccountBean acc);
			//list.add(bean);
			// READ 12.조회 (전체 리스트)
			public List<AccountBean> list() ;
			//READ 13.계좌번호
			public AccountBean findByAccountNo(String account ) ;
			// REWAD 14. 조회(이름)
			public List<AccountBean> findByName(String name) ;
			// READ 15. 조회(전체통장수)
			public int count() ;
			// public  String withdraw(int output);
			//16.통장내역
			public void showAccount() ;
			//17. UPDATE
			public String updateAccount(AccountBean bean);
			// 18.해지
			public String deleteAccount(String account);

			
}
