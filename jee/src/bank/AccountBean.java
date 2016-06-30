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
	private String name;
	private int money;
	
	private String id;
	private String pw;
	
	/* (non-Javadoc)
		 * @see java.lang.Object#clone()
		 */
			
	public AccountBean(){
		// default constructor 기본 생성자
		// 생성자 오버로딩
		
	}	
	public AccountBean(String name, String id, String pw) {
		setAccountNo();
		this.name = name;
		this.id =id;
		this.pw=pw;
		
	}
	public void setAccountNo() {
		// TODO Auto-generated method stub
		this.accountNo=(int) ((Math.random() * 999999) + 100000);
		if(this.accountNo > 999999){
			this.accountNo -= 100000;
		}
	}

	
	public void setMoney(int money) {
		this.money += money;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getAccountNo() {
		return this.accountNo;
	}
	public void setName(String name) {
		this.name= name;
		// TODO Auto-generated method stub

	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}

	public int getMoney() {
		return this.money;

	}
	public String getId() {
		return this.id;
	}

	public String getPw() {
		return this.pw;
	}
	
		/*if (output > this.money){
			JOptionPane.showMessageDialog(null, "출금액이 잔액 보다 큽니다");
			
		}else {
			this.money -= output;
			result = String.valueOf(money);	
		}
*/

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return Constants.BANK_NAME+
				"계좌번호" + accountNo + ""
				+ ", 이름=" + name + ""
				+ ", 잔액=" + money + ""
				+ ", id=" + id +"\n";
				
	}

}
