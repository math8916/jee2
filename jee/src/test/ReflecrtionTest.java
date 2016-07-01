package test;

import member.MemberBean;

/**
 *@date    :2016. 7. 1.
 *@author  :최인철
 *@file    : ReflecrtionTest.java
 *@story  :
 */
public class ReflecrtionTest {
	public static void main(String[] args) {
//		MemberBean mem = new MemberBean();
		try {
			MemberBean mem = (MemberBean) Class.forName("member.Memberbean").newInstance();
		//	MemberBean mem = Class.forName(className)
			mem.setId("hong");
			mem.setName("홍길동");
			mem.setPw("1");
			System.out.println(mem.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
			} 
		
		//
		
	
				
	}
}
