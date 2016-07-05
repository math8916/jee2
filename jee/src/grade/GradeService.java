package grade;

import java.util.List;

public interface GradeService {
	public String insert (GradeBean grade);
	public String update (GradeBean grade);
	public String delete (GradeBean grade);
	
	public List<GradeBean> list();
	public List<GradeBean> findByHakjum();
	public GradeBean findBySeq(int input4);
	public int count();
	
	
	public String regist(GradeBean gdb);
	
	
	
		
	

}
