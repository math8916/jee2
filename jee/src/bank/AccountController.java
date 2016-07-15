package bank;

import javax.swing.JOptionPane;

import member.MemberBean;
import member.MemberService;
import member.MemberServiceImpl;

/**
 * @date : 2016. 6. 15.
 * @author : 최인철
 * @file_name : Bankcontroller.java
 * @story :
 */
public class AccountController {
	public static void main(String[] args) {

		AccountService service = AccountServiceImpl.getInstence();
		MemberService memberService = MemberServiceImpl.getInstance();
		while (true) {

			switch (JOptionPane.showInputDialog(null, "1.개설 \n2.입금 \n3.출금 \n4.수정 비밀번호 \n5.해지" + " "
					+ "\n6.조회 전체 \n 7.조회(계좌번호) \n8.조회(이름)" + " \n9.(전체통장) \n10.로그인 \n0.종료 \n ")) {

			case "1":
				AccountBean acc = new AccountBean();
				String id = JOptionPane.showInputDialog("ID입력하시여");
				acc.setMoney(0);
				acc.setId(id);

				String msg = service.openAccount(acc);
				JOptionPane.showMessageDialog(null, msg);

				break;
			case "2":
				AccountBean acc1 = new AccountBean();
				String inputMoney = JOptionPane.showInputDialog("입금계좌 번호와 입금액을 입력하세요 ? ");
				String[] insert1 = inputMoney.split(",");
				acc1.setAccountNo(Integer.parseInt(insert1[0]));
				acc1.setMoney(Integer.parseInt(insert1[1]));

				// account.setMoney(Integer.parseInt(inputMoney));
				String msg1 = service.deposit(acc1);
				JOptionPane.showMessageDialog(null, msg1);
				break;
			case "3":
				AccountBean acc2 = new AccountBean();
				String outMoney = JOptionPane.showInputDialog("출금계좌 번호와 입금액을 입력하세요 ? ");
				String[] insert2 = outMoney.split(",");
				acc2.setAccountNo(Integer.parseInt(insert2[0]));
				acc2.setMoney(Integer.parseInt(insert2[1]));

				// account.setMoney(Integer.parseInt(inputMoney));
				service.withdraw(acc2);
				break;
			case "4":
				MemberBean stu1 = new MemberBean();
				String input2 = JOptionPane.showInputDialog(null, "변경 아이디 입력, 재 비밀번호");
				String[] inputArr1 = input2.split(",");
				stu1.setId(inputArr1[0]);
				stu1.setPw(inputArr1[1]);
				JOptionPane.showMessageDialog(null, memberService.update(stu1));
				break;
			/*
			 * AccountBean acc3 = new AccountBean(); String update =
			 * JOptionPane.showInputDialog("변경할 ID 및 비밀 번호를 입력하세요 ? "); String[]
			 * insert3 = update.split(","); acc3.setId(insert3[0]);
			 * acc3.setPw(insert3[1]);
			 * 
			 * // account.setMoney(Integer.parseInt(inputMoney));
			 * service.updateAccount(acc3); break;
			 */
			case "5":
				String delete = JOptionPane.showInputDialog("삭제할 계좌번호를 입력하세요 ? ");

				// account.setMoney(Integer.parseInt(inputMoney));
				JOptionPane.showMessageDialog(null, service.deleteAccount(delete));
				break;
			case "6":
				BankUI ui = new BankUI();
//				JOptionPane.showMessageDialog(null, service.list());
				break;
			case "7":
				String accountNo = JOptionPane.showInputDialog("조회할 계좌번호를 입력하세요 ? ");

				// account.setMoney(Integer.parseInt(inputMoney));
				JOptionPane.showMessageDialog(null, service.findByAccountNo(Integer.parseInt(accountNo)));

				break;
			case "8":
				String name = JOptionPane.showInputDialog("조회할 이름를 입력하세요 ? ");

				// account.setMoney(Integer.parseInt(inputMoney));
				JOptionPane.showMessageDialog(null, service.findBy(name));

				break;
			case "9":
				JOptionPane.showMessageDialog(null, "전체 통장 수는" + service.count() + "개 입니다.");
				break;
			case "10":
				
				break;
			case "0":
				JOptionPane.showConfirmDialog(null, "close?");

				return;

			}
		}
	}
}
