package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
	PreparedStatement pstmt = null;
	ResultSet rs = null; //executeQuery()에서만 사용하는 객체
	/**
	 * 
	 */
	private static MemberDAO instans = new MemberDAO();

	private MemberDAO() {
		// TODO Auto-generated constructor stub

	}

	public int insert(MemberBean mem) {
		String sql = "insert into member(id,pw,name,reg,ssn)" + "values('" + mem.getId() + "','" + mem.getPw() + "','"
				+ mem.getName() + "','" + mem.getReg() + "','" + mem.getSsn() + "')";
		return exeUpDate(sql);
	}

	public int update(MemberBean mem) {

		String sql = "update member set pw='" + mem.getPw() + "" + "' where id='" + mem.getId() + "' ";
		return exeUpDate(sql);
	}

	public int delete(MemberBean mem) {

		String sql = "delete from member where id='" + mem.getId() + "' ";
		return exeUpDate(sql);
	}

	public static MemberDAO getInstans() {
		return instans;
	}

	public int exeUpDate(String sql) {

		int updateResult = 0;

		
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.USER_ID, Constants.USER_PW);
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

	// list

	public List<MemberBean> list() {
		String sql="slect * from member";
		List<MemberBean> list = new ArrayList<MemberBean>();
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(
					Constants.ORACLE_URL, 
					Constants.USER_ID, 
					Constants.USER_PW);
			stmt = con.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				MemberBean t= new MemberBean(rs.getString("ID"),rs.getString("PW"),rs.getString("NAME"),rs.getString("SSN")
						);
				t.setReg(rs.getString("REG"));
				list.add(t);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	// findByPK
	public MemberBean findByID(String pk) {
		String sql ="slecet * from member where id = '"+pk+"'" ;
		MemberBean temp = null;
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(
					Constants.ORACLE_URL,
					Constants.USER_ID,
					Constants.USER_PW);
			stmt = con.createStatement();
			rs= stmt.executeQuery(sql);
			if(rs.next()){
				temp= new MemberBean(rs.getString("ID"),rs.getString("PW"),rs.getString("NAME"),rs.getString("SSN"));
				rs.getString("REG");
			}
				;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	// findByNotPK
	public List<MemberBean> findByName(String name) {
		String sql = "select * from member where name ='"+name+"' ";
		List<MemberBean> list = new ArrayList<MemberBean>();
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(
					Constants.ORACLE_URL, 
					Constants.USER_ID, 
					Constants.USER_PW);
			stmt = con.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				MemberBean t= new MemberBean(rs.getString("ID"),rs.getString("PW"),rs.getString("NAME"),rs.getString("SSN")
						);
				t.setReg(rs.getString("REG"));
				list.add(t);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	// count
	public int count() {
		String sql="select count(*) as count from member";
		int count=0;
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(
					Constants.ORACLE_URL, 
					Constants.USER_ID, 
					Constants.USER_PW);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				count=rs.getInt("count");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	/**
	 * @param member
	 * @return
	 */
	public boolean login(MemberBean member) {
		boolean loginok =false;
		MemberBean m = this.findByID(member.getId());
		m.getPw().equals(member.getPw());
		return loginok;
	}
}
