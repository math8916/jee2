package grade;

import java.util.List;

import global.CommonService;

public interface GradeService extends CommonService {
	public String insert (GradeBean grade);
	public String update (GradeBean grade);
	public String delete (String grade);
	
//	public List<?> list();
//	public List<?> findBy();
	public GradeBean findBySeq(int input4);
	public int count();
	
	
	public String regist(GradeBean gdb);
	/**
	 * @param sid
	 * @return
	 */
//	public List<?> findBy(String sid);
	public String gradeRank(GradeBean grade);
	
	
	
		
	

}
