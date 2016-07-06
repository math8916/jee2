package grade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

	private static GradeDAO instans = new GradeDAO();

	private GradeDAO() {
		con = DatabaseFactory.createDatabase(Vender.ORACLE, Constants.USER_ID, Constants.USER_PW).getConnection();
	}

	public int insert(GradeBean gdb) {
		int result = 0;
		String sql = "insert into grade(seq,grade,jave,sql,html,javascript,id,exam_date) values("
				+ "seq.nextval,?,?,?,?,?,?,?)";

		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, gdb.getGrade());
			psmt.setInt(2, gdb.getJava());
			psmt.setInt(3, gdb.getSql());
			psmt.setInt(4, gdb.getHtml());
			psmt.setLong(5, gdb.getJavascript());
			psmt.setString(6, gdb.getId());
			psmt.setString(7, gdb.getExam_date());
			result = psmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// + gdb.getGrade() + "," + gdb.getJava() + "," + gdb.getSql() + "," +
		// gdb.getHtml() + ","
		// + gdb.getJavascript() + ",'" + gdb.getId() + "','" +
		// gdb.getExam_date() + "')";
		// TODO Auto-generated method stub
		return result;
	}

	public int update(GradeBean gdb) {
		int result = 0;
		// "update grade set ?,?,?,?,?,?,?"
		String sql = "update grade set " + gdb.getUpdateclass() + "=? where seq =?";
		try {
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, gdb.getUpdateclassnum());
			psmt.setString(2, gdb.getSeq());
			psmt.executeUpdate();
			gdb = findBySeq(Integer.parseInt(gdb.getSeq()));
			String sql1 = "update grade set grade=? where seq =?";
			psmt = con.prepareStatement(sql1);
			psmt.setString(1, GradeServiceImpl.getInstane().gradeRank(gdb));
			psmt.setString(2, gdb.getSeq());
			result = psmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * // String sql = "update grade set grade='" + gdb.getGrade()+"'"()+"
		 * // where seq=" + gdb.getSeq() ; this.exeUpDate(sql); String sql1 =
		 * "update grade set grade ='" + gdb.getGrade() + "' where seq=" +
		 * gdb.getSeq();
		 */
		return result;
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
	public int delete(String delete) {
		int result = 0;
		String sql = "delete from grade where seq=?";

		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, delete);
			result = psmt.executeUpdate();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public List<GradeBean> list() {
		List<GradeBean> list = new ArrayList<GradeBean>();
		String sql = "select * from grade";
		try {
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				GradeBean g = new GradeBean();
				g.setSeq(rs.getString("seq"));
				g.setId(rs.getString("id"));
				g.setGrade(rs.getString("grade"));
				g.setExam_date(rs.getString("exam_date"));
				g.setJava(rs.getInt("jave"));
				g.setSql(rs.getInt("sql"));
				g.setHtml(rs.getInt("html"));
				g.setJavascript(rs.getInt("javascript"));

				list.add(g);
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
	public GradeBean findBySeq(int pk) {
		GradeBean result = null;
		String sql = "select * from grade where seq=?";

		try {
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, pk);
			rs = psmt.executeQuery();

			if (rs.next()) {
				GradeBean g = new GradeBean();
				g.setSeq(rs.getString("seq"));
				g.setId(rs.getString("id"));
				g.setGrade(rs.getString("grade"));
				g.setExam_date(rs.getString("exam_date"));
				g.setJava(rs.getInt("jave"));
				g.setSql(rs.getInt("sql"));
				g.setHtml(rs.getInt("html"));
				g.setJavascript(rs.getInt("javascript"));
				result = g;

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * try { Class.forName(Constants.ORACLE_DRIVER); con =
		 * DriverManager.getConnection(Constants.ORACLE_URL, Constants.USER_ID,
		 * Constants.USER_PW); stmt = con.createStatement(); rs =
		 * stmt.executeQuery(sql); if (rs.next()) { result = new
		 * GradeBean(rs.getString("seq"), rs.getString("id"),
		 * rs.getString("grade"), rs.getString("exam_date"), rs.getInt("jave"),
		 * rs.getInt("sql"), rs.getInt("html"), rs.getInt("javascript"));
		 * 
		 * } } catch (Exception e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */

		return result;
	}

	public int count() {
		int result = 0;
		String sql = "select count(*) as count from grade where exam_date=?";
		try {
			psmt = con.prepareStatement(sql);
			// psmt = con.prepareStatement(1, )
			rs = psmt.executeQuery();
			if (rs.next()) {
				result = rs.getInt("count");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	/**
	 * @return
	 */
	public List<GradeBean> findById(String sid) {
		List<GradeBean> result = new ArrayList<GradeBean>();
		String sql = "select * from grade where id=?";
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, sid);
			rs = psmt.executeQuery();
			while (rs.next()) {
				GradeBean g = new GradeBean();
				g.setSeq(rs.getString("seq"));
				g.setId(rs.getString("id"));
				g.setGrade(rs.getString("grade"));
				g.setExam_date(rs.getString("exam_date"));
				g.setJava(rs.getInt("jave"));
				g.setSql(rs.getInt("sql"));
				g.setHtml(rs.getInt("html"));
				g.setJavascript(rs.getInt("javascript"));

				result.add(g);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated method stub
		return result;
	}
}
