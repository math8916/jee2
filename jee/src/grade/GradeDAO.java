package grade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *@date    :2016. 7. 1.
 *@author  :최인철
 *@file    : GradeDAO.java
 *@story  :
 */
public class GradeDAO {
	public static void main(String[] args) {
		Connection con =null;
		Statement stmt=null;
		ResultSet set =null;
		int UpdateResult =0;
		String sqlCreate = "create table grade("
				+ "name varchar2(20),"
				+ "kor varchar2(20),"
				+ "eng varchar2(20),"
				+ "math varchar2(20)"
				+ ")";
		String sqlDrop="drop table grade";
	}
}
