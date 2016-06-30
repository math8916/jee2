package grade;


import javax.swing.JOptionPane;

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
		GradeService service = new GradeServiceImpl();
		while (true) {
			switch (JOptionPane.showInputDialog("1.입력 2.조회 0.종료")) {
			case "1":
				String insert = JOptionPane.showInputDialog("이름 , 국어 , 영어, 수학");
				String[] insert1 = insert.split(",");
				service.regStudent(insert1[0], Integer.parseInt(insert1[1]), Integer.parseInt(insert1[2]),
						Integer.parseInt(insert1[3]));
				break;
			case "2":
				JOptionPane.showMessageDialog(null, service.result());
				break;
			case "0" :
				return;
			}
		}
	}

}
