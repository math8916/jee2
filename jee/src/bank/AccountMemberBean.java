package bank;

/**
 * @date :2016. 7. 7.
 * @author :최인철
 * @file : AccountMember.java
 * @story :
 */
public class AccountMemberBean {
	private int accountNo,money; // 인스턴스 변수는 초기화 하지 않는다.
	private String id,pw,name,reg,ssn,birth;

	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getReg() {
		return reg;
	}
	public void setReg(String reg) {
		this.reg = reg;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "계좌번호" + accountNo + ", ID" + id + ", pw=*****, 이름 " + name + ", 잔고 ="
				+ money + "원, reg=" + reg + ", ssn=" + ssn + "]\n";
	}

}
