package grade;

import java.util.List;

public interface GradeService {
	public int insert (GradeBean grade);
	public int update (GradeBean grade);
	public int delete (GradeBean grade);
	
	public List<GradeBean> list();
	public List<GradeBean> findByHakjum();
	public GradeBean findBySeq(int seq);
	public int count();
	
	
	
		
	

}
