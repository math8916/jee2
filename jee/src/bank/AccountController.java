package bank;

import javax.swing.JOptionPane;

/**
 * @date : 2016. 6. 15.
 * @author : 최인철
 * @file_name : Bankcontroller.java
 * @story :
 */
public class AccountController {
	public static void main(String[] args) {

		AccountService service = AccountServiceImpl.getInstence();
		while (true) {

			switch (JOptionPane.showInputDialog(null,
					"1.개설 2.입금 3.출금 4.수정 비밀번호 5.해지 " + "6.조회 전체 \n 7.조회 8.조회(이름) 9.(전체통장) 0.종료 \n ")) {

			case "1":
				AccountBean acc = new AccountBean();
				String id = JOptionPane.showInputDialog("ID입력하시여");
				acc.setMoney(0);
				acc.setId(id);

				service.openAccount(acc);

				break;
			case "2":
				AccountBean acc1 = new AccountBean();
				String inputMoney = JOptionPane.showInputDialog("계좌 번호와 입금액을 입력하세요 ? ");
				String[] insert1 = inputMoney.split(",");
				acc1.setAccountNo(Integer.parseInt(insert1[0]));
				acc1.setMoney(Integer.parseInt(insert1[1]));
				
				// account.setMoney(Integer.parseInt(inputMoney));
				service.deposit(Integer.parseInt(inputMoney));
				break;
			case "3":
				// JOptionPane.showMessageDialog(null, service.findAccount());
				break;
			case "4":
				String output = JOptionPane.showInputDialog("출금액 ? ");
				service.withdraw(Integer.parseInt(output));
				JOptionPane.showMessageDialog(null, service.withdraw(Integer.parseInt(output)));

				break;
			case "5":
				// JOptionPane.showMessageDialog(null,service.showAccount());
				break;
			case "6":
				JOptionPane.showMessageDialog(null, service.deleteAccount());
				break;
			case "11":
				String list = JOptionPane.showInputDialog("이름,ID,PW");

				String[] listArr = list.split(",");
				// listArr = new ArrayList<AccountBean>();
				// service.openAccount(listArr[0],listArr[1],listArr[2]);
				// AccountBean acc = new AccountBean();
				// acc.setAccountNo();
				// acc.setName(listArr[0]);
				// acc.setId(listArr[1]);
				// acc.setPw(listArr[2]);
				// bankService.openAccount(acc);
				break;

			case "0":
				JOptionPane.showConfirmDialog(null, "close?");

				return;

			}
		}
	}
}
