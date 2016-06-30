package grade;

public class GradeServiceImpl implements GradeService {
	GradeBean gra ;
	@Override
	public void regStudent(String name, int kor, int eng, int math) {
		// TODO Auto-generated method stub
		gra =new GradeBean(name,kor,eng,math) ;
		if (kor > 100 || eng >100 ||math>100 || kor <0||eng<0||math<0) {
			System.out.println("점수가 100점이 넘어습니다 아니면 0 보다 작은 수입니다. 다시 입력하시요");

		}	
	}
	@Override
	public int outsum() {
		// TODO Auto-generated method stub
		return gra.getKor()+gra.getEng()+gra.getMath();
	}

	@Override
	public int ave() {
		// TODO Auto-generated method stub
		return outsum()/3;
	}
	@Override
	public String grade() {
		// TODO Auto-generated method stub
		String grade ="";
		switch (ave()/10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		case 5:
			grade = "e";
			break;

		default:
			grade = "f";
			break;
			
		}		
		
		return grade;
	}
	@Override
	public String result() {
		// TODO Auto-generated method stub
		return "이름 "+gra.getName()+"\n총점 "+outsum()+" \n 평균 "+ave()+" \n등급"+grade();
	}

}
