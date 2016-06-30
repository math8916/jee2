package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class BankServiceImpl implements BankService {
	List<AccountBean> list = new Vector<AccountBean>();

	@Override
	public void openAccount(AccountBean bean) {
		// TODO Auto-generated method stub
		list.add(bean);

	}

	@Override
	public List<AccountBean> list() {
		return list;

		// TODO Auto-generated method stub

	}

	@Override
	public AccountBean findByAccountNo(String account) {
		AccountBean acc = new AccountBean();
		int i = 0;
		for (; i < list.size(); i++) {
			if (account.equals(String.valueOf(list.get(i).getAccountNo()))) {
			acc =	list.get(i);
				break;
			}

		}
		return acc;

		// TODO Auto-generated method stub

	}


	@Override
	public int count() {
		return list.size();
		// TODO Auto-generated method stub

	}

	@Override
	public void showAccount() {
		// TODO Auto-generated method stub

	}

	@Override
	public String deleteAccount(String delete) {
		// TODO Auto-generated method stub
		String result ="";
		AccountBean temp1 =this.findByAccountNo(delete);
		if (temp1.getId()==null) {
			result ="계좌 번호가 존재하지 않습니다.";
			
		}else{
			list.remove(temp1);
			result = "계좌가 삭제 되었습니다.";
		}
		return result;
	}
	@Override
	public String updateAccount(AccountBean bean) {
		// TODO Auto-generated method stub
		String result ="";
		AccountBean temp =this.findByAccountNo(String.valueOf(bean.getAccountNo()));
		if (temp.getId()==null) {
			result ="계좌 번호가 존재하지 않습니다.";
			
		}else{
			temp.setPw(bean.getPw());
			result = "비밀번호가 변경 되었습니다.";
		}
		return result;
	}

	@Override
	public List<AccountBean> findByName(String name) {
		List<AccountBean> accName = new ArrayList<AccountBean>();
		int i = 0;
		for (; i < list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
			accName .add(list.get(i));
				
			}

		}
		// TODO Auto-generated method stub
		return accName;
	}

}
