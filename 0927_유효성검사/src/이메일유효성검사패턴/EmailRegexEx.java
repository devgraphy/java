package �̸�����ȿ���˻�����;

/* # ����

## ��Ÿ���� �ǹ�
\w =>�� ���� ���ĺ� �Ǵ� �� ���� ����
(��) [A-Z A-Z 0-9]�� ������ �ǹ��� ��Ÿ ����

+=> �� �� �̻�
{}=> �׷���
?=> ���� �Ǵ� �� ��

## �̸��� ����
���� ����:
- king1234@naver.com
- kim1234@gmail.com

ȸ�� ����:
- ern1234@partner.sk.com
- spec@ora.co.kr

## ��ȿ�� �˻� ���� ����
"^\\w+@\\w+\\.\\w+(\\.\\w+)?"

- \\\w+
- \\\w+
- \\\\.  => Ư�� ���� . �� �ν��ϱ� ���� \
- \\\W+
- (\\\\.\\\w+)? => �ɼ�

 * */
public class EmailRegexEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] email_ex = {"king1234@naver.com",
							"kim1234@gmail.com",
							"erin0521@partner.sk.com",
							"asd1234@partner.sk.com.aaa"};
		
		//�̸��� ����
		String email_pattern = "^\\w+@\\w+\\.\\w+(\\.\\w+)?";
		
		for(String email:email_ex) {
			boolean check = email.matches(email_pattern);
			if(check == true) {
				System.out.println("������ �̸����Դϴ�: " + email);
			}
			else{
				System.out.println("�������� �̸����Դϴ�: " + email);
			}
		}
	}

}
