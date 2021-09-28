package �ֹι�ȣ�κ�����������;
/* ����ǥ���� ����
 * �Է¹��� �ֹι�ȣ�� ��ȿ�� �˻� => ���� ǥ����(regex) ���� ����
 * ���� ǥ����: �Էµ� ���ڿ��� ������ �ִ� �������� �Ǿ� �ִ��� �����ϴ� ���� ���Ѵ�. �̹� ��ӵ� ��Ÿ ���ڸ� �������ش�.
 * ��Ÿ ����: ���� �� ���ڰ� ���� ���� �ƴ� Ư���� �뵵�� ���Ǵ� ���ڸ� ���Ѵ�.
 * [] => �� ���� ���� (��)[abc] a,b,c �� �ϳ��� ����
 * {} => �ݺ� ���� (��) {6} 6�� �ݺ�
 * */

/* �˰���
 * �ֹι�ȣ�� �Է� �޾� ��ȿ�� �˻縦 ����
 * ��ȿ���� �����ϸ� �ֹι�ȣ üũ ������ �����Ͽ�
 * ������ �ֹι�ȣ�� ����
 * ����, ����, ��ŵ�, ��������� ����ϴ� ���ø����̼� ����*/

/* ���� ���� �ó�����
 * 1. ���� �ý������κ��� ���� ��� ���� 2021
 * 2. �ֹι�ȣ �� �ڸ��� ������Ͽ��� ���� �� �ڸ��� ������ 97 - ���������� ��ȯ
 * 3. �ֹι�ȣ �� �ڸ��� ù��° �ڸ� 1,2,3,4, �� ��� ������ �� �Ǵ��Ͽ�
 * if 1, 2�� 1900 �� �����ְ� 1900+97 = 1997
 * 3, 4�� 2000�� �����ش�
 * 4. 2021-1997 = ���� ����
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
		int[] weight = {2,3,4,5,6,7,0,8,9,2,3,4,5};	// ����ġ �迭 �ʱ�ȭ
		int temp, result;
		
		// �Է� �ܰ�
		System.out.println("�ֹι�ȣ �Է�>>>");
		Scanner scan = new Scanner(System.in);
		juminNum = scan.next();// ���ڿ��� �Է� ���� -> '-' �����Ͽ� �Է�

		String regex ="^[0-9]{6}-[1234][0-9]{6}$";	// �ֹι�ȣ ����ǥ���� ����
		// ù ��° ���
		// boolean check = Pattern.matches(regex,  juminNum);
		// �� ��° ���
		boolean check = juminNum.matches(regex);
		if(check == false) {
			System.out.println("�Էµ� �ֹι�ȣ�� ���� ǥ���Ŀ� ���Ŀ� ���� ����!");
			return;
		}
		System.out.println("�Էµ� �ֹι�ȣ�� ���� ǥ���Ŀ� ������!");

		// 1�ܰ� ���� => sum ���ϱ�
		//System.out.println(Character.getNumericValue(juminNum.charAt(0)));
		//System.out.println(juminNum.charAt(6));	
		for(int i = 0; i <13; i++) {
			if(juminNum.charAt(i) == '-') continue;
				sum += (juminNum.charAt(i)-48)*weight[i];
		}
		
		System.out.println(sum);
		// 2�ܰ� ���� - temp���� 2�ڸ��� �ֹι�ȣ�� ����(���� ����). 10 or 11
		temp = 11 - (sum%11);
		// 3�ܰ� ���� - 1�ڸ��� ���������
		result = temp%10;
		

		// ���� ����
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);	// ���� ���� ���ϱ�
		int yy = Integer.parseInt(juminNum.substring(0,2));
		if((juminNum.charAt(7)-48) < 3) {
			yy = yy + 1900;
		}
		else {
			yy = yy + 2000;
		}
		int age = year-yy +1; // ������
		
		System.out.println(age);
		
		// ���� ����
		if((juminNum.charAt(7)-48)%2 == 0) {
			System.out.println("����: ����"); // 2,4 �� ���
		}
		else {
			System.out.println("����: ����");
		}
		// ������� ���� 
		// �����ڵ带 2���� �迭�� �ʱ�ȭ - ������ ����
		String[][] localCode = {{"����","00","08"},{"�λ�","09","12"},
								{"��õ","13","15"},{"���","16","25"},{"����","26","34"},
								{"���","35","39"},{"����","40","40"},{"�泲","41","43"},
								{"�泲","45","47"},{"����","44","44"},{"����","96","96"},
								{"����","48","54"},{"����","55","64"},{"����","65","66"},
								{"�뱸","67","70"},{"���","71","80"},{"�泲","81","84"},
								{"�泲","86","90"},{"���","85","85"},{"����","91","95"}};
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
		System.out.println("�������: " + birthPlace);
		
		// '�������' ����
		System.out.println("�������: "+yy+"/"+juminNum.substring(2,4)+"/"+juminNum.substring(4,6));
		// '��' ����
		String ddl = null;
		String[] gangi = {"������","��","��","����","��","��","��","�䳢","��","��","��","��"};
		ddl = gangi[yy%12];
		System.out.println("��: "+ddl);
		
	}

}
