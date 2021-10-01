/* ----------<문제 정의>----------
 * 문제: 금액을 입력받아 탐욕 알고리즘으로 5만원, 1만원, 5천원, 1천원이 몇 매인지 그리고 500원, 100원, 50원, 10원, 1원 짜리 동전 몇 개로 변환되는지 출력
 * 제한 조건: 배열 적용
 * */
/* ----------<접근법>----------
 *  5만원, 1만원, 5천원, 1천원이 몇 매인지 그리고 500원, 100원, 50원, 10원, 1원을 각각 배열의 원소로 구성
 *  큰 금액부터 나누어 떨어지지 않을 때까지 다른 배열에 몇 개가 들어가는지 계산.
 *  나누어 떨어지지 않으면 인덱스 증가(다음 금액 계산)
 * */
package 실습문제1회;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		int[] val = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		int[] cnt = new int[9];	// 0으로 초기화
		int idx = 0;
		Scanner in = new Scanner(System.in);
		int money = in.nextInt();
		while(money != 0) {
			if(money / val[idx] > 0) {
				cnt[idx] = money / val[idx];
				money%=val[idx];
				//System.out.println(money);
			}
			idx++;
		}
		for(int i = 0; i < val.length; i++) {
			if(cnt[i] > 0) {
				if(i == 0) System.out.println("오만원권 " + cnt[i] + "매");
				else if(i == 1) System.out.println("만원건 " + cnt[i] + "매");
				else if(i == 2) System.out.println("오천원건 " + cnt[i] + "매");
				else if(i == 3) System.out.println("천원건 " + cnt[i] + "매");
				else if(i == 4) System.out.println("오백원 " + cnt[i] + "개");
				else if(i == 5) System.out.println("백원 " + cnt[i] + "개");
				else if(i == 6) System.out.println("오십원 " + cnt[i] + "개");
				else if(i == 7) System.out.println("십원 " + cnt[i] + "개");
				else if(i == 8) System.out.println("일원 " + cnt[i] + "개");
			}
		}
	}

}
