/* ----------<���� ����>----------
 * ����: ��ҹ��� ��ȯ�ϱ�
 * */
/*----------<���ٹ�>----------
 * �ҹ��� �Է� -> �빮�� ��ȯ -32
 * �빮�� �Է� -> �ҹ��� ��ȯ +32
 * ������ ���� -> "�����ڰ� �ƴմϴ�" ���
 * 
 * */

package �ǽ�����1ȸ;

import java.util.Scanner;

public class CharConverter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char ch = in.next().charAt(0);
		
		if(ch >= 'a' && ch <= 'z') System.out.println((char)((int)ch - 32));
		else if(ch >= 'A' && ch <= 'Z') System.out.println((char)((int)ch + 32));
		else System.out.println("�����ڰ� �ƴմϴ�.");
	}

}
