/* ----------<���� ����>----------
 * ����: �ݾ��� �Է¹޾� Ž�� �˰������� 5����, 1����, 5õ��, 1õ���� �� ������ �׸��� 500��, 100��, 50��, 10��, 1�� ¥�� ���� �� ���� ��ȯ�Ǵ��� ���
 * ���� ����: �迭 ����
 * */
/* ----------<���ٹ�>----------
 *  5����, 1����, 5õ��, 1õ���� �� ������ �׸��� 500��, 100��, 50��, 10��, 1���� ���� �迭�� ���ҷ� ����
 *  �ݾ� ���� ���ڿ� ���� �迭�� �����ؼ� if, else���� �������� �� �ʿ����.
 *  ū �ݾ׺��� ������ �������� ���� ������ �ٸ� �迭�� �� ���� ������ ���.
 *  ������ �������� ������ �ε��� ����(���� �ݾ� ���)
 * */
package �ǽ�����1ȸ;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		int[] val = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		String[] str = {"��������","������","��õ����","õ����","�����","���","���ʿ�","�ʿ�","�Ͽ�"};
		int[] cnt = new int[9];	// 0���� �ʱ�ȭ
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
				if(i < 4) System.out.println(str[i] + " " + cnt[i] + "��");
				else System.out.println(str[i] + " " + cnt[i] + "��");
			}
		}
	}

}
