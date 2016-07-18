package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	Connection con ;
	Statement stmt;
	PreparedStatement pstmt ;
	ResultSet rs = null; //executeQuery()에서만 사용하는 객체
	/**
	 * 
	 */
	private static MemberDAO instans = new MemberDAO();

	private MemberDAO() {
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(
					Constants.ORACLE_URL,
					Constants.USER_ID,
					Constants.USER_PW);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}
	public int insert(MemberBean mem) {
		String sql = "insert into member(id,pw,name,reg,ssn,email)" + "values('" + mem.getId() + "','" + mem.getPw() + "','"
				+ mem.getName() + "','" + mem.getReg() + "','" + mem.getSsn() + "','" +mem.getEmail()+mem.getProfileImg()+"')";
		return exeUpDate(sql);
	}

	public int update(MemberBean mem) {

		String sql = "update member"
				+ " set pw=? , email=?"
				+ " where id=? ";
		int result=0;
		try {
			pstmt= con.prepareStatement(sql);
			pstmt.setString(1, mem.getPw());
			pstmt.setString(2, mem.getEmail());
			pstmt.setString(3, mem.getId());
			result= pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result == 0) {
			System.out.println("실패");
		} else {
			System.out.println("성공");
		}
	return result;
	}

	public int delete(MemberBean mem) {

		String sql = "delete from member where id=?" ;
		int result=0;
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, mem.getId());
			result= pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result == 0) {
			System.out.println("실패");
		} else {
			System.out.println("성공");
		}
	return result;
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
		String sql="select * from member";
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
				t.setReg(rs.getString("EMAIL"));
				t.setReg(rs.getString("PROFILE_IMG"));
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
		String sql ="select * from member where id = '"+pk+"'" ;
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
			    temp.setEmail(rs.getString("email"));	
				temp.setReg(rs.getString("REG"));
				temp.setProfileImg(rs.getString("profile_img"));    
			}
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
	public boolean login(MemberBean param) {
		boolean loginok =false;
		if(param.getId()!=null 
				&& param.getPw()!=null
				&& this.existId(param.getId())){
			MemberBean member = this.findByID(param.getId());
		if(member.getPw().equals(param.getPw())){
			loginok=true;
		}
		}
		return loginok;
	}
	public boolean existId(String id) {
		boolean existOK=false;
		String sql="select count(*) as count from member where id = ?";
		int result =0;
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()){
				result = rs.getInt("count");
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result==1){
			existOK=true;
		}
		return existOK;
	}
}
