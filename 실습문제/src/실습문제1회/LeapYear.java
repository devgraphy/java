/* ----------<���� ����>----------
 * ����: ���� ���(4�� ������ �������� �ϴ� ����, ���⼭ 100���� ������ �������� ���, ���⼭ �� 400���� �������� �ٽ� ����) 
 * */

package �ǽ�����1ȸ;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		boolean leapyear = false;	// false: ���, true: ����
		
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
		if(leapyear) System.out.println("�����Դϴ�.");
		else	System.out.println("����Դϴ�.");
	}

}
