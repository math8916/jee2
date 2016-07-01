/**
 * 
 */
package member;

import java.text.SimpleDateFormat;

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
	public void updatw(String pw );
	//4.삭제
	public void delete();
	

}
