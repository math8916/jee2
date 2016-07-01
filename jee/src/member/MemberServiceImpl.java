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
		String sql = "insert into member(id,pw,name,reg,ssn)"
				+ "values('"+mem.getId()+"','"+mem.getPw()+"','"+mem.getName()+"','"+mem.getReg()+"','"+mem.getSsn()+"')";
		int result = dao.exeUpDate(sql);
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
	public void updatw(String pw) {
		// TODO Auto-generated method stub

	}

	@Override
	// 4. 삭제
	public void delete() {
		// TODO Auto-generated method stub
	}
}

/*
 * String sqlCreate =" create table member(" + "ssn varchar2(20) ,"
 * +" name varchar2(20)," +"id varchar2(20) primary key," +"pw varchar2(20),"
 * +"gender varchar2(20)," +"age int," +"reg varchar2(20)" +")";
 */