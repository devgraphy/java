/* ----------<문제 정의>----------
 * 문제: 대소문자 변환하기
 * */
/*----------<접근법>----------
 * 소문자 입력 -> 대문자 변환 -32
 * 대문자 입력 -> 소문자 변환 +32
 * 나머지 문자 -> "영문자가 아닙니다" 출력
 * 
 * */

package 실습문제1회;

import java.util.Scanner;

public class CharConverter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char ch = in.next().charAt(0);
		
		if(ch >= 'a' && ch <= 'z') System.out.println((char)((int)ch - 32));
		else if(ch >= 'A' && ch <= 'Z') System.out.println((char)((int)ch + 32));
		else System.out.println("영문자가 아닙니다.");
	}

}
