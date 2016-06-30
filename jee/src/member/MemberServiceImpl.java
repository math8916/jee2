package member;

public class MemberServiceImpl implements MemberService {
	MemberBean student;
	@Override
	//1.등록
	public void registStudent(String id, String pw, String name, String ssn) {
		// TODO Auto-generated method stub
		student = new MemberBean(name, pw, id, ssn);
	}

	@Override
	//2.보기
	public String showStudent() {
		// TODO Auto-generated method stub
		return student.toString();
	}

	@Override
	//3. 수정
	public void updatwStudent(String pw) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//4. 삭제
	public String deleteStudent() {
		// TODO Auto-generated method stub
		student=null;
		return " 삭제";
	}
}