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
	
	switch (JOptionPane.showInputDialog(null,"1.등록 2 보기 3. 수정(비번) 4.삭제 0 . 종료")) {
	
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
	MemberBean stu1 = new MemberBean();
	String input2 = JOptionPane.showInputDialog(null, "변경 아이디 입력, 재 비밀번호");
	String[] inputArr1 = input2.split(",");
	stu1.setId(inputArr1[0]);
	stu1.setPw(inputArr1[1]);
	JOptionPane.showMessageDialog(null,service.updatw(stu1));
		break;

case "4":
	MemberBean stu2 = new MemberBean();
	String input3 = JOptionPane.showInputDialog(null, "삭제 아이디 입력");
	
	
	stu2.setId(input3);
	JOptionPane.showMessageDialog(null, service.delete(stu2));
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

