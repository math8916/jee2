/**
 * 
 */
package member;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JOptionPane;
import javax.websocket.Session;


/**
 * @date   : 2016. 6. 17.
 * @author : 최인철
 * @file_name : StudentService.java
 * @story : 
*/
public interface MemberService {
	//1.등록
	public String regist(MemberBean mem);
	//2.보기
	public String show();
	//3.수정
	public void update(MemberBean mem );

	//4.삭제

	public void delete(MemberBean mem);
	
	public int count();
	
	public MemberBean findByID(String findID);
	
	public List<MemberBean> findByName(String findName);
	
	public List<MemberBean> list();
	
	public String login(MemberBean member);
	public MemberBean getSession();
	public void logout(MemberBean member);
		
	}

