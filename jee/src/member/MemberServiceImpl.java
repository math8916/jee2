package member;

public class MemberServiceImpl implements MemberService {

	MemberDAO dao = MemberDAO.getInstans();
	private static MemberServiceImpl instance = new MemberServiceImpl();
	
	private MemberServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	public static MemberServiceImpl getInstance() {
		return instance;
	}
	// MemberBean mem = Class.forName("member.MemberBean").newInstance();
	@Override
	// 1.등록
	public String regist(MemberBean mem) {
		// TODO Auto-generated method stub
		String msg="";
		int result = dao.insert(mem);
		if (result ==1) {
			msg="가입 성공";
		}else{
			msg="가입 실패";
		}
		return msg;
	}

	@Override
	// 2.보기
	public String show() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	// 3. 수정
	public String updatw(MemberBean mem) {
		String msg="";
		
		if (dao.update(mem) ==1) {
			msg="변경 성공";
		}else{
			msg="변경 실패";
		}
		return msg;
		// TODO Auto-generated method stub

	}

	@Override
	// 4. 삭제
	public String delete(MemberBean mem) {
		// TODO Auto-generated method stub
		String msg="";
		
		if (dao.delete(mem) ==1) {
			msg="변경 성공";
		}else{
			msg="변경 실패";
		}
		return msg;
	}
}

/*
 * String sqlCreate =" create table member(" + "ssn varchar2(20) ,"
 * +" name varchar2(20)," +"id varchar2(20) primary key," +"pw varchar2(20),"
 * +"gender varchar2(20)," +"age int," +"reg varchar2(20)" +")";
 */