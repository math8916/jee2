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
	MemberService service = new MemberServiceImpl();

	while (true) {
	
	switch (JOptionPane.showInputDialog(null,"1.등록 2 보기 3. 수정 4.삭제 0 . 종료")) {
	
	case "1":
		String insert= JOptionPane.showInputDialog("이름,PW,ID,SSN");
		String[] insert1 = insert.split(",");
		service.registStudent(insert1[0],insert1[1],insert1[2],insert1[3]);
		
		break;

case "2":
		
	JOptionPane.showMessageDialog(null,service.showStudent());
		break;
case "3":
	String pw = JOptionPane.showInputDialog(null, "재 비밀번호");
	service.updatwStudent(pw);
		break;

case "4":
	JOptionPane.showMessageDialog(null, service.deleteStudent());
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

