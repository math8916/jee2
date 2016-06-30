/**
 * 
 */
package member;

import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

/**
 * @date : 2016. 6. 16.
 * @author : 최인철
 * @file_name : Student.java
 * @story :
 */
public class MemberBean {
	private String ssn;
	private String name;
	private String id;
	private String pw;
	private String gender;
	private int age;
	private String reg;
/**
 * 
 */
public MemberBean() {

}

	public MemberBean(String id, String pw, String name, String ssn) {
		this.name = name;
		this.pw = pw;
		this.id = id;
		this.ssn = ssn;
		String now = new SimpleDateFormat("yyyy-MM-dd").format(System.currentTimeMillis());
		this.reg = now;
		String[] arr0 = now.split("-");
		int d = Integer.parseInt(arr0[0]);
		String[] arr = ssn.split("-");
		int c = Integer.parseInt(arr[1]);
		int dage = Integer.parseInt(arr[0]);
		if (c == 0 || c == 9) {
			JOptionPane.showMessageDialog(null, "주민등록 번호 뒤자리에 0,9는 안됩니다. 다시 입력하세요");
			return;
		}
		switch ((dage / 100000) % 2) {
		case 0:
			age = d - (dage / 10000 + 2000);
			break;

		default:
			age = d - (dage / 10000 + 1900);
			break;
		}
		switch (c % 2) {
		case 0:
			this.gender = "여";
			break;

		default:
			this.gender = "남";
			break;
		}
	}
	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getSsn() {
		return this.ssn;

	}

	public String getName() {
		return this.name;

	}

	public String getId() {
		return this.id;
	}

	public String getPw() {
		return this.pw;

	}

	public int getAge() {
		return this.age;
	}

	public String getGender() {
		return this.gender;
	}

	public String getReg() {
		return this.reg;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "학생" + name + ", "
				+ "id=" + id + ", "
				+ "비번" + "******" + ", "
				+ "성별=" + gender + ", "
				+ "나이=" + age + ","
				+ " 등록일자" + reg + "]";
	}

}