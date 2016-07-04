/**
 * 
 */
package member;

import javax.swing.JOptionPane;


/**
 * @date : 2016. 6. 16.
 * @author : 최인철
 * @file_name : ShoolController.java
 * @story :
 */
public class ShoolController {

	public static void main(String[] args) {
		MemberService service = MemberServiceImpl.getInstance();

		while (true) {

			switch (JOptionPane.showInputDialog(null,
					"---회원이 보는 화면 -----\n " + "1.회원가입 2.로그인 3.내정보 수정(비밀번호) 4.비번 변경 5.탈퇴 0.종료 \n"
							+ "-----관리자 화면 ---------\n" + "11회원목록 12검색(ID) 13검색(이름) 14회원수(성별) 15회원수")) {

			case "1":
				MemberBean stu = new MemberBean();
				String insert = JOptionPane.showInputDialog("ID,PW,이름,SSN");
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

				JOptionPane.showMessageDialog(null, service.show());
				break;
			case "4":
				MemberBean stu1 = new MemberBean();
				String input2 = JOptionPane.showInputDialog(null, "변경 아이디 입력, 재 비밀번호");
				String[] inputArr1 = input2.split(",");
				stu1.setId(inputArr1[0]);
				stu1.setPw(inputArr1[1]);
				JOptionPane.showMessageDialog(null, service.updatw(stu1));
				break;

			case "5":
				MemberBean stu2 = new MemberBean();
				String input3 = JOptionPane.showInputDialog(null, "삭제 아이디 입력");

				stu2.setId(input3);
				JOptionPane.showMessageDialog(null, service.delete(stu2));
				// JOptionPane.showMessageDialog(null, service.delete());
				break;
			case"11":
				JOptionPane.showMessageDialog(null, service.list());
				break;
			case "12":
				String findID = JOptionPane.showInputDialog(null, "조회할 아이디 입력");
				JOptionPane.showMessageDialog(null, service.findByID(findID));
				break;
			case "13":
				String findName = JOptionPane.showInputDialog(null, "조회할 이름 입력");
				JOptionPane.showMessageDialog(null, service.findByName(findName));
				break;
			
			case "14":
				break;
			case "15":
				int count = service.count();
				JOptionPane.showMessageDialog(null, service.count());

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
