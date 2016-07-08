package grade;

import javax.swing.JOptionPane;

import member.MemberBean;

/**
 * @date : 2016. 6. 8.
 * @author : 최인철
 * @file_name : Avg.java
 * @story :
 */
public class GradeController {
	/**
	 * 클라이언트에서 프로그래 개발 요청이 왓습니다. 이름과 국,영,수,세과목 점수를 입력받아서 [홍기동 : 총정 ***점 , 평균
	 * ***점, 합격 :()] 을 출력하는 프로그램을 만들어 주세요. 단) 평균은 소수점이하는 절삭합니다. 평균점수가 60점 미만이면
	 * 불합격 , 이상이면 합격입니다. 90점 이상이면 A 80점 이상이면 B 70점 이상이면 C 60점 이상이면 D 50점 이상이면 E
	 * 50점 이하이면 F 학점입니다
	 */

	public static void main(String[] args) {

		GradeService service = GradeServiceImpl.getInstane();
		while (true) {
			switch (JOptionPane.showInputDialog("1.추가 2.수정 3.삭제4,전체조회 5.학점..조회(seq) 6,시퀸스조회(Id) 7응시생수 0.종료")) {

			case "1":
				GradeBean gdb = new GradeBean();
				String insert = JOptionPane
						.showInputDialog("점수및 아이디 시험일자을 입력하시오 " + "jave,sql,html,javascript,id,exam_date");
				String[] insert1 = insert.split(",");
				gdb.setJava(Integer.parseInt(insert1[0]));
				gdb.setSql(Integer.parseInt(insert1[1]));
				gdb.setHtml(Integer.parseInt(insert1[2]));
				gdb.setJavascript(Integer.parseInt(insert1[3]));
				gdb.setId(insert1[4]);
				gdb.setExam_date(insert1[5]);
				service.insert(gdb);

				// service.regStudent(insert1[0], Integer.parseInt(insert1[1]),
				// Integer.parseInt(insert1[2]),
				// Integer.parseInt(insert1[3]));
				break;
			case "2":
				GradeBean gdb1 = new GradeBean();
				String insert2 = JOptionPane.showInputDialog(null, "점수를 수정할 Seq및 과목 및 점수를 입력하세요");
				String[] insert3 = insert2.split(",");
				gdb1.setSeq(insert3[0]);
				gdb1.setUpdateclass(insert3[1]);
				gdb1.setUpdateclassnum(Integer.parseInt(insert3[2]));
				JOptionPane.showMessageDialog(null, service.update(gdb1));
				break;
			case "3": // 삭제
				String input3 = JOptionPane.showInputDialog(null, "삭제할 Seq 입력하세요");
				JOptionPane.showMessageDialog(null, service.delete(input3));
				break;
			case "4": // 전체 리스트
	//			JOptionPane.showMessageDialog(null, service.list());
				GradeUI ui = new GradeUI();
				break;
			case "5":
				String input4= JOptionPane.showInputDialog("조회할 Seq 입력하세요");
				JOptionPane.showMessageDialog(null, service.findBySeq(Integer.parseInt(input4)));
				break;
			case "6":
				String sid = JOptionPane.showInputDialog( "조회할 아이디 입력하세요 예 :2016-05 ");
				JOptionPane.showMessageDialog(null, service.findBy(sid));
				break;
			case "7": // 응시생 수
				String exemDate = JOptionPane.showInputDialog( "조회할 시험일자 입력하세요 예 :2016-05 ");
				
				break;
			case "8": // 응시생 수
				JOptionPane.showMessageDialog(null, "조회할 시험일자 입력하세요");
				break;
			case "0":
				return;
			}
		}
	}

}
