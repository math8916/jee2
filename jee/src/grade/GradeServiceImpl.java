package grade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class GradeServiceImpl implements GradeService {

	GradeDAO dao = GradeDAO.getInstans();
	public static GradeServiceImpl getInstane() {
		return instane;
	}

	public static void setInstane(GradeServiceImpl instane) {
		GradeServiceImpl.instane = instane;
	}

	private static GradeServiceImpl instane = new GradeServiceImpl();

	private GradeServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int insert(GradeBean grade) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(GradeBean grade) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(GradeBean grade) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<GradeBean> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GradeBean> findByHakjum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GradeBean findBySeq(int seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}
}