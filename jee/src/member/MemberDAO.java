package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import global.Constants;

/**
 * @date :2016. 7. 1.
 * @author :최인철
 * @file : MemberDAO.java
 * 
 * @story :
 */
public class MemberDAO {
	Connection con = null;
	Statement stmt = null;
	ResultSet set = null;
	/**
	 * 
	 */
	private static MemberDAO instans = new MemberDAO();

	private MemberDAO() {
		// TODO Auto-generated constructor stub

	}

	public static MemberDAO getInstans() {
		return instans;
	}

	public int exeUpDate(String sql) {

		int updateResult = 0;

		String sqlDrop = "drop table member";
		String sqlInsert = "";
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.ORACLE_ID, Constants.ORACLE_PW);
			stmt = con.createStatement();
			updateResult = stmt.executeUpdate(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (updateResult == 0) {
			System.out.println("실패");
		} else {
			System.out.println("성공");
		}
			return updateResult;
	}

	public void exeQuery(String sql) {

	}
}
