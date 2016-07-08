package bank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @date :2016. 7. 8.
 * @author :최인철
 * @file : IteratorEX.java
 * @story :
 */
public class IteratorEX {
	public static void main(String[] args) {
		Map<?,?> map = new HashMap<String,AccountMemberBean>();
		AccountDAO dao = AccountDAO.getInstans();
		map=dao.selectMap();
		Set<?> keyset = map.keySet();
		Iterator<?> it = keyset.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println();
		}
		Collection<?> accounts = map.values();
		it = accounts.iterator();
		List<AccountMemberBean> list = new ArrayList<AccountMemberBean>();
		while (it.hasNext()) {
			AccountMemberBean obj = (AccountMemberBean) it.next();
			
				 list.add(obj);
				 
			}
		
	Collections.sort(list,new NameAsSort());
	for (int i=0; i< list.size();i++){
		System.out.println(list.get(i)+"\n");
	}
	Collections.sort(list,new AccountNoAsSort());
	for (int i=0; i< list.size();i++){
		System.out.println(list.get(i)+"\n");
	}
}
}
