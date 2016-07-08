package bank;

import java.util.Comparator;

/**
 *@date    :2016. 7. 8.
 *@author  :최인철
 *@file    : NameAsSort.java
 *@story  :
 */
public class NameAsSort implements Comparator<AccountMemberBean> {

	
	@Override
	public int compare(AccountMemberBean first, AccountMemberBean second) {
		return first.getName().compareTo(second.getName());
	}
	

}
