package grade;

public class GradeBean {
	private int kor, eng, math;
	private String name;

	public GradeBean(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

		// TODO Auto-generated constructor stub

	}

	public void setName(String name) {
		this.name = name;

	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;

	}

	public void setMath(int math) {
		this.math = math;
	}

	/*
	 * public void setTotal(int total) { this.total=total; }
	 * 
	 * public int getTotal() { return total;
	 * 
	 * } public void setAve(int ave) { this.ave=ave; } public int getAve() {
	 * return ave;
	 * 
	 * }
	 */
	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;

	}

	public int getMath() {
		return math;
	}

}
