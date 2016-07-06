package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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

}
