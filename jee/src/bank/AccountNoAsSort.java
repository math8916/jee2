package bank;

import java.util.Comparator;

/**
 * @date :2016. 7. 8.
 * @author :최인철
 * @file : NameAsSort.java
 * @story :
 */
public class AccountNoAsSort implements Comparator<AccountMemberBean> {


		 @Override
		 public int compare(AccountMemberBean first, AccountMemberBean second) {
		 int a = 0;
		  if (first.getAccountNo()>second.getAccountNo()) {
		  a = 1;
		 } else {
		  if (first.getAccountNo()<second.getAccountNo()) {
		   a = -1;
		  } else {
		   a = 0;
		  }
		 }
		  
		  return a;
		  
		 }

		}