/**
 * 
 */
package member;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JOptionPane;


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
	public String updatw(MemberBean mem );
	//4.삭제

	public String delete(MemberBean mem);
	/**
	 * @return
	 */
	public int count();
	/**
	 * @param findID
	 * @return
	 */
	public MemberBean findByID(String findID);
	
	public List<MemberBean> findByName(String findName);
	/**
	 * @return
	 */
	public List<MemberBean> list();
	
	public String login(MemberBean member);
}
