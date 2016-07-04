package grade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *@date    :2016. 7. 1.
 *@author  :최인철
 *@file    : GradeDAO.java
 *@story  :
 */
public class GradeDAO {
		Connection con =null;
		Statement stmt=null;
		PreparedStatement psmt=null;
		ResultSet set =null;
/**
 * 
 */	
 private static GradeDAO instans = new GradeDAO();
		
private GradeDAO() {
	// TODO Auto-generated constructor stub
}

public static GradeDAO getInstans() {
	return instans;
}



	
		
}

