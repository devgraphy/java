/* ----------<문제 정의>----------
 * 문제: 윤년 계산(4로 나누어 떨어지면 일단 윤년, 여기서 100으로 나누어 떨어지면 평년, 여기서 또 400으로 떨어지면 다시 윤년) 
 * */

package 실습문제1회;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		boolean leapyear = false;	// false: 평년, true: 윤년
		
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		if(year % 4 == 0) {
			leapyear = true;
			if(year % 100 == 0) {
				leapyear = false;
				if(year % 400 == 0)
					leapyear = true;
			}
		}
		if(leapyear) System.out.println("윤년입니다.");
		else	System.out.println("평년입니다.");
	}

}
