package grade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sun.java.swing.plaf.windows.WindowsBorders.DashedBorder;

import global.Constants;
import global.DatabaseFactory;
import global.Vender;

/**
 * @date :2016. 7. 1.
 * @author :최인철
 * @file : GradeDAO.java
 * @story :
 */
public class GradeDAO {
	Connection con;
	Statement stmt;
	PreparedStatement psmt;
	ResultSet rs;

	public GradeBean findBySeq(int pk) {
		String sql = "select * from grade where seq=" + pk;
		GradeBean temp = null;
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.USER_ID, Constants.USER_PW);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				temp = new GradeBean(rs.getString("seq"), rs.getString("id"), rs.getString("grade"),
						rs.getString("exam_date"), rs.getInt("jave"), rs.getInt("sql"), rs.getInt("html"),
						rs.getInt("javascript"));

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	private static GradeDAO instans = new GradeDAO();

	private GradeDAO() {
		con = DatabaseFactory.createDatabase(Vender.ORACLE,Constants.USER_ID,Constants.USER_PW).getConnection();
	}

	public int insert(GradeBean gdb) {
		String sql = "insert into grade(seq,grade,jave,sql,html,javascript,id,exam_date) values("
				+ "seq.nextval,?,?,?,?,?,?,?)";
		int result = 0;
		try {
			psmt=con.prepareStatement(sql);
			psmt.setString(1, gdb.getGrade());
			psmt.setInt(2, gdb.getJava());
			psmt.setInt(3, gdb.getSql());
			psmt.setInt(4, gdb.getHtml());
			psmt.setLong(5, gdb.getJavascript());
			psmt.setString(6, gdb.getId());
			psmt.setString(7, gdb.getExam_date());
			result =psmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				// + gdb.getGrade() + "," + gdb.getJava() + "," + gdb.getSql() + "," + gdb.getHtml() + ","
				// + gdb.getJavascript() + ",'" + gdb.getId() + "','" + gdb.getExam_date() + "')";
		// TODO Auto-generated method stub
		return result;
	}

	public int update(GradeBean gdb) {

		String sql = "update grade set " + gdb.getUpdateclass() + "=" + gdb.getUpdateclassnum() + " where seq="
				+ gdb.getSeq();

		// String sql = "update grade set grade='" + gdb.getGrade()+"'"()+"
		// where seq=" + gdb.getSeq() ;
		return exeUpDate(sql);
	}

	/**
	 * @param sql
	 * @return
	 */
	private int exeUpDate(String sql) {
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
	// TODO Auto-generated method stub

	public static GradeDAO getInstans() {
		return instans;
	}

	/**
	 * @param grade
	 * @return
	 */
	public int delete(GradeBean grade) {
		String sql = "delete from grade where seq=" + grade.getSeq();
		// TODO Auto-generated method stub
		return exeUpDate(sql);
	}

	public List<GradeBean> list() {
		String sql = "select * from grade";
		List<GradeBean> list = new ArrayList<GradeBean>();
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.USER_ID, Constants.USER_PW);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				GradeBean t = new GradeBean(rs.getString("seq"), rs.getString("id"), rs.getString("grade"),
						rs.getString("exam_date"), rs.getInt("jave"), rs.getInt("sql"), rs.getInt("html"),
						rs.getInt("javascript"));

				list.add(t);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	/**
	 * @param gdb
	 * @return
	 */

}
