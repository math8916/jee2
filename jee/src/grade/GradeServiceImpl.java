package grade;

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
	public String insert(GradeBean grade) {
		String insert = "";
		int sum =grade.getJava()+grade.getSql()+grade.getHtml()+grade.getJavascript();
		int ave =sum/4;
		String gradeRank ="";
		gradeRank = gradeRank(ave);
		grade.setGrade(gradeRank);
		// TODO Auto-generated method stub
		return insert;
	}

	/**
	 * @param ave
	 * @return
	 */
	public String gradeRank(int ave) {
		String gradeRank;
		switch (ave/10) {
		case 10:
		case 9:
			gradeRank = "A";
			break;
		case 8:
			gradeRank = "B";
			break;
		case 7:
			gradeRank = "C";
			break;
		case 6:
			gradeRank = "D";
			break;
		case 5:
			gradeRank = "E";
			break;

		default:
			gradeRank = "F";
			break;
		}
		return gradeRank;
	}

	@Override
	public String update(GradeBean grade) {
		// TODO Auto-generated method stub
		String msg="";
		
		if (dao.update(grade) ==1) {
			msg="변경 성공";
		}else{
			msg="변경 실패";
		}
		return  msg;
	}

	@Override
	public String delete(GradeBean grade) {
		String msg="";
		
		if (dao.delete(grade) ==1) {
			msg="변경 성공";
		}else{
			msg="변경 실패";
		}
		return msg;
	}

	@Override
	public List<GradeBean> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}

	@Override
	public List<GradeBean> findByHakjum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GradeBean findBySeq(int seq) {
		// TODO Auto-generated method stub
		return dao.findBySeq(seq);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String regist(GradeBean gdb) {
		String msg="";
		int result = dao.insert(gdb);
		// TODO Auto-generated method stub
		return null;
	}
	
}