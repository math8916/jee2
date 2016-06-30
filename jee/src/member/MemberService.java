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
	public void registStudent(String name, String pw,String id,String ssn);
	//2.보기
	public String showStudent();
	//3.수정
	public void updatwStudent(String pw );
	//4.삭제
	public String deleteStudent();
	

}
