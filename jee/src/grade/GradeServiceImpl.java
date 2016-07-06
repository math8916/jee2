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
		grade.setGrade(this.gradeRank(grade));
		if(dao.insert(grade)==1){
			insert ="성공";
			System.out.println(grade.toString());
		}else{
			insert ="실패";
		}
			
		
		return insert;
	}

	/**
	 * @param ave
	 * @return
	 */
	public String gradeRank(GradeBean grade) {
		
		String gradeRank="";
		int sum =grade.getJava()+grade.getSql()+grade.getHtml()+grade.getJavascript();
		int ave =sum/4;
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
	public String delete(String grade) {
		String msg="";
		
		if (dao.delete(grade) == 1) {
			msg="변경 성공";
		}else{
			msg="변경 실패";
		}
		return msg;
	}

	@Override
	public List<GradeBean> list() {
		List<GradeBean> list =dao.list();
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public List<GradeBean> findByHakjum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GradeBean findBySeq(int seq) {
		
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

	@Override
	public List<GradeBean> findById(String sid) {
		
		// TODO Auto-generated method stub
		return dao.findById(sid);
	}
	
}