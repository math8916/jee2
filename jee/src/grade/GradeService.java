package grade;

import java.util.List;

import global.CommonService;

public interface GradeService extends CommonService {
	public String insert (GradeBean grade);
	public String update (GradeBean grade);
	public String delete (String grade);
	
	public List<GradeBean> list();
	public List<GradeBean> findByHakjum();
	public GradeBean findBySeq(int input4);
	public int count();
	
	
	public String regist(GradeBean gdb);
	/**
	 * @param sid
	 * @return
	 */
	public List<GradeBean> findById(String sid);
	public String gradeRank(GradeBean grade);
	
	
	
		
	

}
