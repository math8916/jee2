package test;

import bank.AccountBean;
import member.MemberBean;

/**
 *@date    :2016. 7. 1.
 *@author  :최인철
 *@file    : ReflecrtionTest.java
 *@story  :
 */
public class ReflecrtionTest2 {
	public static void main(String[] args) {
//		MemberBean mem = new MemberBean();
	
	//		MemberBean mem = (MemberBean) Class.forName("member.Memberbean").newInstance();
			try {
				AccountBean acc = (AccountBean) Class.forName("bank.AccountBean").newInstance();
				acc.setAccountNo(12345);
				acc.setId("lee");
				acc.setPw("lee");
				acc.setName("이현우");
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			/*		mem.setId("hong");
			mem.setName("홍길동");
			mem.setPw("1");
			System.out.println(mem.toString());*/
	}
}
}