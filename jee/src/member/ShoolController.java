/**
 * 
 */
package member;

import javax.swing.JOptionPane;

import bank.AccountBean;

/**
 * @date   : 2016. 6. 16.
 * @author : 최인철
 * @file_name : ShoolController.java
 * @story : 
*/
public class ShoolController {

public static void main(String[] args) {
	MemberService service =MemberServiceImpl.getInstance();

	while (true) {
	
	switch (JOptionPane.showInputDialog(null,"1.등록 2 보기 3. 수정 4.삭제 0 . 종료")) {
	
	case "1":
		MemberBean stu = new MemberBean();
		String insert= JOptionPane.showInputDialog("ID,PW,이름,SSN");
		String[] insert1 = insert.split(",");
		stu.setId(insert1[0]);
		stu.setPw(insert1[1]);
		stu.setName(insert1[2]);
		stu.setSsn(insert1[3]);
		stu.setReg();
		String result = service.regist(stu);
JOptionPane.showMessageDialog(null, result);

		break;

case "2":
		
	JOptionPane.showMessageDialog(null,service.show());
		break;
case "3":
	String pw = JOptionPane.showInputDialog(null, "재 비밀번호");
	service.updatw(pw);
		break;

case "4":
	//JOptionPane.showMessageDialog(null, service.delete());
	break;

case "0":
	JOptionPane.showConfirmDialog(null, "close?");
	return;

	default:
		break;
	}
}
}
}	

