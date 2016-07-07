package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import global.Constants;
import global.DatabaseFactory;
import global.Vender;

/**
 * @date :2016. 7. 1.
 * @author :최인철
 * @file : BankDAO.java
 * @story :
 */
public class AccountDAO {
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;

	/**
	 * 
	 */
	private static AccountDAO instans = new AccountDAO();

	private AccountDAO() {
		con = DatabaseFactory.createDatabase(Vender.ORACLE, Constants.USER_ID, Constants.USER_PW).getConnection();
	}

	public static AccountDAO getInstans() {
		return instans;
	}

	/**
	 * @param acc
	 * @return
	 */
	public int openAccount(AccountBean acc) {
		int result=0;
		String sql ="insert into account(accountno,money,id) values(?,?,?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, acc.getAccountNo());
			pstmt.setInt(2, acc.getMoney());
			pstmt.setString(3, acc.getId());
			result =pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

}
