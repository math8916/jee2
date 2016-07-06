package bank;

import java.util.List;

import javax.swing.JOptionPane;

/**
 * @date : 2016. 6. 15.
 * @author : 최인철
 * @file_name : Bankcontroller.java
 * @story :
 */
public class AccountController {
	public static void main(String[] args) {
		
		AccountService service = AccountServiceImpl.getInstane();
		while (true) {

			switch (JOptionPane.showInputDialog(null, "1.개설 2.입금 3.출금 4.수정 비밀번호 5.해지 "
					+ "6.조회 전체 \n 7.조회 8.조회(이름) 9.(전체통장) 0.종료 \n ")){
					

			case "1":
				String id = JOptionPane.showInputDialog("ID입력하시여");
				if (id.equals(service))
				
				service.openAccount(id);
				
				break ;
			case "2":
				String inputMoney = JOptionPane.showInputDialog("입금액 ? ");
		//		account.setMoney(Integer.parseInt(inputMoney));
				service.deposit(Integer.parseInt(inputMoney)) ;
				break;
			case "3":
	//			JOptionPane.showMessageDialog(null, service.findAccount());
				break;
			case "4":
				String output = JOptionPane.showInputDialog("출금액 ? ");
				service.withdraw(Integer.parseInt(output));
				JOptionPane.showMessageDialog(null, service.withdraw(Integer.parseInt(output)));
				
				break;
			case "5":
				JOptionPane.showMessageDialog(null,service.showAccount());
				break;
			case "6":
				JOptionPane.showMessageDialog(null,service.deleteAccount());
				break;
			case "11":
				String list = JOptionPane.showInputDialog("이름,ID,PW");
				
				String[] listArr= list.split(",");
	//			listArr = new ArrayList<AccountBean>();
//				service.openAccount(listArr[0],listArr[1],listArr[2]);
				AccountBean acc = new AccountBean();
				acc.setAccountNo();
				acc.setName(listArr[0]);
				acc.setId(listArr[1]);
				acc.setPw(listArr[2]);
				bankService.openAccount(acc);
				break ;
			case "12":
				// 조회
				JOptionPane.showMessageDialog(null, bankService.list());
				break;
			case "13":
				// 계좌번호 조회
				String searchAccount=JOptionPane.showInputDialog("검색 계좌 번호 입력하세요");
				bankService.findByAccountNo(searchAccount);
				JOptionPane.showMessageDialog(null, bankService.findByAccountNo(searchAccount));
				break;
			case "14":
				List<AccountBean> searchName=bankService.findByName(JOptionPane.showInputDialog("검색 이름 입력하세요"));
					
				JOptionPane.showMessageDialog(null,(searchName.isEmpty()?"검색하는 이름이 없습니다":searchName.toString()));
				// 이름 조회
				break;
			case "15":
				JOptionPane.showMessageDialog(null, bankService.count()+"개");
				break;
			case "16": 
				String changeAccount=JOptionPane.showInputDialog("변경할  계좌 번호, 비밀번호 입력하세요");
				String[] changeArr=changeAccount.split(",");
				bean.setAccountNo(Integer.parseInt(changeArr[0]));
				bean.setPw(changeArr[1]);
				
				JOptionPane.showMessageDialog(null, bankService.updateAccount(bean));
				
				break;
			case "17":
			String deleteAcc=JOptionPane.showInputDialog("삭제할  계좌 번호 입력하세요");
			// 삭제 조회
			JOptionPane.showMessageDialog(null, bankService.deleteAccount(deleteAcc));
			 break;
			
			case "0":
				JOptionPane.showConfirmDialog(null, "close?");
				
				return;

			}
		}
	}
}
