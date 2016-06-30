/**
 * 
 */
package member;

import java.util.Scanner;

/**
 * @date : 2016. 6. 10.
 * @author : 최인철
 * @file_name : Gender.java
 * @story :
 */
public class Gender {
	public static void main(String[] args) {
		/**
		 * 개발자님 저희 사이트는 주민번호 앞자리와 성별 판별번호만 입력합니다 예를 들어 800101-1 까지만 입력하면 소비자가
		 * 자신이 남자인지 여자인지 밝히지 않아도 자동으로 Db에 저장되는 시스템을 개발해 주세요 출력문은 홍길동 (남),아이유(여)
		 * 
		 * 
		 */

		/*
		 * 1,2 : 국내 1900년대생 남,녀 3,4 : 국내 2000년대생 남,녀 5,6 : 외국 1900년대생 남,녀 7,8 :
		 * 외국 2000년대생 남,녀
		 */
		Scanner scanner = new Scanner(System.in);
		String name = "", idNo = "", gender = "여자";
		// ------op ------
		System.out.println("이름을 입력 하세요 :");
		name = scanner.next();
		System.out.println("주민번호를 다음 형식으로 입력하세요 000000-0 :");
		idNo = scanner.next();
		// 연산부
		char c = idNo.charAt(7);
		if (c == '0' || c == '9' || c>58 || c<48) {
			System.out.println("잘못 입력 하셨습니다.");
			return;
		}
		// -- up casting c가 char에서 정수로 치환
		// 실제 문자 1은 49번 이다
		if (c % 2 == 1) {
			gender = "남";
		}
		System.out.println(name + " ( " + gender + ")");
	}

}
