package bank;

import global.Constants;

/**
 * @date : 2016. 6. 16.
 * @author : 최인철
 * @file_name : Account.java
 * @story :
 */
public class AccountBean { // 클래스 ,헤더 접근제한 -클래스 종류
	private int accountNo; // 인스턴스 변수는 초기화 하지 않는다.
	
	private int money;
	
	private String id;
	
	
	/* (non-Javadoc)
		 * @see java.lang.Object#clone()
		 */
			
	public AccountBean(){
		// default constructor 기본 생성자
		// 생성자 오버로딩
		
	}	
	
	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String toString() {
		return Constants.BANK_NAME+
				"계좌번호" + accountNo + ""
				+ ", 이름=" 
				+ ", 잔액=" + money + ""
				+ ", id=" + id +"\n";
				
	}

}
