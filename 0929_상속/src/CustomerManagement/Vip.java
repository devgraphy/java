/*
 Vip
	- �߰� �Ӽ�: x
	- ���� ���: 
		- ��ǰ ����: buyProduct(int ����) 10%���ε� ���� ���
		- ����Ʈ ����: savePoint(int ����) 5% ���� �� ���� �Ϸ� ���
	- �߰� ���:
		- ���� ����: alignConsultant("���� �̸�") �� ����
 * */
package CustomerManagement;

public class Vip extends Customer {
	// Ŭ���� ����
	
	// ����� �޼��� ����
	public void buyProduct(int price) {
		double last_price = price * (1-discount(10));
		System.out.println(price * (1-discount(10)) + "�� ��ġ�� �����ϼ̽��ϴ�.");
		savePoint(last_price, 5);
	}
	public void alignConsultant(String name) {
		
	}

}
