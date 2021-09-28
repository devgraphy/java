package 주민번호로부터정보추출;
/* 정규표현식 개념
 * 입력받은 주민번호를 유효성 검사 => 정규 표현식(regex) 패턴 적용
 * 정규 표현식: 입력된 문자열이 정해져 있는 형식으로 되어 있는지 검증하는 것을 말한다. 이미 약속된 메타 문자를 제공해준다.
 * 메타 문자: 원래 그 문자가 가진 뜻이 아닌 특별한 용도로 사용되는 문자를 말한다.
 * [] => 한 개의 문자 (예)[abc] a,b,c 중 하나의 문자
 * {} => 반복 개념 (예) {6} 6번 반복
 * */

/* 알고리즘
 * 주민번호를 입력 받아 유효성 검사를 한후
 * 유효성에 적합하면 주민번호 체크 공식을 적용하여
 * 정상인 주민번호일 때만
 * 나이, 성별, 출신도, 생년월일을 출력하는 애플리케이션 적용*/

/* 나이 추출 시나리오
 * 1. 현재 시스템으로부터 연도 얻어 내기 2021
 * 2. 주민번호 앞 자리의 생년월일에서 연도 두 자리만 얻어오기 97 - 정수값으로 변환
 * 3. 주민번호 뒤 자리의 첫번째 자리 1,2,3,4, 중 어느 것인지 비교 판단하여
 * if 1, 2면 1900 을 더해주고 1900+97 = 1997
 * 3, 4면 2000을 더해준다
 * 4. 2021-1997 = 나이 추출
 * */

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Calendar;
import java.util.Date;
public class JuminCheckEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String juminNum;
		int sum = 0;
		int[] weight = {2,3,4,5,6,7,0,8,9,2,3,4,5};	// 가중치 배열 초기화
		int temp, result;
		
		// 입력 단계
		System.out.println("주민번호 입력>>>");
		Scanner scan = new Scanner(System.in);
		juminNum = scan.next();// 문자열로 입력 받음 -> '-' 포함하여 입력

		String regex ="^[0-9]{6}-[1234][0-9]{6}$";	// 주민번호 정규표현식 패턴
		// 첫 번째 방법
		// boolean check = Pattern.matches(regex,  juminNum);
		// 두 번째 방법
		boolean check = juminNum.matches(regex);
		if(check == false) {
			System.out.println("입력된 주민번호는 정규 표현식에 형식에 맞지 않음!");
			return;
		}
		System.out.println("입력된 주민번호는 정규 표현식에 적합함!");

		// 1단계 적용 => sum 구하기
		//System.out.println(Character.getNumericValue(juminNum.charAt(0)));
		//System.out.println(juminNum.charAt(6));	
		for(int i = 0; i <13; i++) {
			if(juminNum.charAt(i) == '-') continue;
				sum += (juminNum.charAt(i)-48)*weight[i];
		}
		
		System.out.println(sum);
		// 2단계 공식 - temp값이 2자리인 주민번호가 존재(많진 않음). 10 or 11
		temp = 11 - (sum%11);
		// 3단계 공식 - 1자리로 만들기위함
		result = temp%10;
		

		// 나이 추출
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);	// 현재 연도 구하기
		int yy = Integer.parseInt(juminNum.substring(0,2));
		if((juminNum.charAt(7)-48) < 3) {
			yy = yy + 1900;
		}
		else {
			yy = yy + 2000;
		}
		int age = year-yy +1; // 본나이
		
		System.out.println(age);
		
		// 성별 추출
		if((juminNum.charAt(7)-48)%2 == 0) {
			System.out.println("성별: 여자"); // 2,4 인 경우
		}
		else {
			System.out.println("성별: 남자");
		}
		// 출신지역 추출 
		// 지역코드를 2차원 배열로 초기화 - 가독성 목적
		String[][] localCode = {{"서울","00","08"},{"부산","09","12"},
								{"인천","13","15"},{"경기","16","25"},{"강원","26","34"},
								{"충북","35","39"},{"대전","40","40"},{"충남","41","43"},
								{"충남","45","47"},{"세종","44","44"},{"세종","96","96"},
								{"전북","48","54"},{"전남","55","64"},{"광주","65","66"},
								{"대구","67","70"},{"경북","71","80"},{"경남","81","84"},
								{"경남","86","90"},{"울산","85","85"},{"제주","91","95"}};
		String localeString = juminNum.substring(8, 10);
		int locale = Integer.parseInt(localeString);
		//System.out.println(locale);
		String birthPlace = null;
		for(int i =0; i <=19;i++) {
			if(locale >= Integer.parseInt(localCode[i][1]) &&
					locale <= Integer.parseInt(localCode[i][2])) {
				birthPlace = localCode[i][0];
				break;
			}
		}
		System.out.println("출신지역: " + birthPlace);
		
		// '생년월일' 추출
		System.out.println("생년월일: "+yy+"/"+juminNum.substring(2,4)+"/"+juminNum.substring(4,6));
		// '띠' 추출
		String ddl = null;
		String[] gangi = {"원숭이","닭","개","돼지","쥐","소","범","토끼","용","뱀","말","양"};
		ddl = gangi[yy%12];
		System.out.println("띠: "+ddl);
		
	}

}
