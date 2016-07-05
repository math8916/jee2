package grade;

public class GradeBean {
	private String seq,id,grade,exam_date,updateclass;
	private int java, sql,html,javascript,updateclassnum;
	
	/**
	 * 
	 */
	public GradeBean() {
		// TODO Auto-generated constructor stub
	}
	public GradeBean(String seq,String id,String grade,String exam_date,int java,int sql,int html,int javascript) {
		this.seq= seq;
		this.id=id;
		this.grade=grade;
		this.exam_date=exam_date;
		this.java=java;
		this.sql=sql;
		this.html=html;
		this.javascript=javascript;

		// TODO Auto-generated constructor stub

	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getSql() {
		return sql;
	}
	public void setSql(int sql) {
		this.sql = sql;
	}
	public int getHtml() {
		return html;
	}
	public void setHtml(int html) {
		this.html = html;
	}
	public int getJavascript() {
		return javascript;
	}
	public void setJavascript(int javascript) {
		this.javascript = javascript;
	}
	
	public String getExam_date() {
		return exam_date;
	}
	public void setExam_date(String exam_date) {
		this.exam_date = exam_date;
	}
	@Override
	public String toString() {
		return "성적표 [No:" + seq + ", 이름 :" + id + ", grade=" + grade + ", java=" + java + ", sql=" + sql
				+ ", html=" + html + ", javascript=" + javascript + "]";
	}
	/**
	 * @param string
	 */
	/**
	 * @param string
	 */
	public String getUpdateclass() {
		return updateclass;
	}
	public void setUpdateclass(String updateclass) {
		this.updateclass = updateclass;
	}
	public int getUpdateclassnum() {
		return updateclassnum;
	}
	public void setUpdateclassnum(int updateclassnum) {
		this.updateclassnum = updateclassnum;
	}
	
	
}	