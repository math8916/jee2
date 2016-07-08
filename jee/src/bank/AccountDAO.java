package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import global.Constants;
import global.DatabaseFactory;
import global.Vender;
import grade.GradeBean;

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
		int result = 0;
		String sql = "insert into account(accountno,money,id) values(?,?,?)";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, acc.getAccountNo());
			pstmt.setInt(2, acc.getMoney());
			pstmt.setString(3, acc.getId());
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	public int deposit(AccountBean inputMoney) {
		int result = 0;
		String sql = "update account set money=money + ? where accountno = ?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, inputMoney.getMoney());

			pstmt.setInt(2, inputMoney.getAccountNo());
			System.out.println(inputMoney.getAccountNo());
			System.out.println("test" + result);
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	public int withdraw(AccountBean outMoney) {
		int result = 0;
		String sql = "update account set money=money - ? where accountno = ?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, outMoney.getMoney());

			pstmt.setInt(2, outMoney.getAccountNo());
			System.out.println(outMoney.getAccountNo());
			System.out.println("test" + result);
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	public int updateAccount(AccountBean update) {
		int result = 0;
		String sql = "update member set pw=? where id = ?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, update.getPw());

			pstmt.setString(2, update.getId());
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}
	public int deleteAccount(String delete) {
		int result = 0;
		String sql = "delete from account where accountno = ?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, delete);

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	/**
	 * @return
	 */
	public List<?> selectAll() {
		List<AccountMemberBean> list = new ArrayList<AccountMemberBean>();
		String sql = "select * from account_member "
				+ "order by name";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				AccountMemberBean g = new AccountMemberBean();
				g.setAccountNo(rs.getInt("accountno"));
				g.setId(rs.getString("id"));
				g.setPw(rs.getString("pw"));
				g.setName(rs.getString("name"));
				g.setMoney(rs.getInt("money"));
				g.setReg(rs.getString("reg"));
				g.setSsn(rs.getString("ssn").substring(0,6));

				list.add(g);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * @param account
	 * @return
	 */
	public AccountMemberBean findByAccountNo(int account) {
		AccountMemberBean result=null;
		String sql = "select * from account_member where accountno=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, account);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				AccountMemberBean g = new AccountMemberBean();
				g.setAccountNo(rs.getInt("accountno"));
				g.setId(rs.getString("id"));
				g.setPw(rs.getString("pw"));
				g.setName(rs.getString("name"));
				g.setMoney(rs.getInt("money"));
				g.setReg(rs.getString("reg"));
				g.setSsn(rs.getString("ssn"));

				result=g;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * @param name
	 * @return
	 */
	public List<AccountMemberBean> findByName(String name) {
		List<AccountMemberBean> list = new ArrayList<AccountMemberBean>();
		String sql = "select * from account_member where name =?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				AccountMemberBean g = new AccountMemberBean();
				g.setAccountNo(rs.getInt("accountno"));
				g.setId(rs.getString("id"));
				g.setPw(rs.getString("pw"));
				g.setName(rs.getString("name"));
				g.setMoney(rs.getInt("money"));
				g.setReg(rs.getString("reg"));
				g.setSsn(rs.getString("ssn"));

				list.add(g);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public int count(){
		int result = 0;
		String sql = "select count(*) as count from account_member";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = rs.getInt("COUNT");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * @return
	 */
	public Map<?, ?> selectMap() {
		Map<String,AccountMemberBean> map = new HashMap<String,AccountMemberBean>(); 
		String sql ="select * from account_member";
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				AccountMemberBean am = new AccountMemberBean();
				am.setAccountNo(rs.getInt("accountno"));
				am.setId(rs.getString("id"));
				am.setPw(rs.getString("pw"));
				am.setName(rs.getString("name"));
				am.setMoney(rs.getInt("money"));
				am.setReg(rs.getString("reg"));
				am.setSsn(rs.getString("ssn"));

				map.put(String.valueOf(am.getAccountNo()), am);

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
