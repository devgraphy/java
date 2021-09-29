/*
 - �Ӽ�: cust_name, bonus_point, consultant
 - ���: ��ǰ ����, ����Ʈ ����, ���� ����(Vip���Ը� �ش�)
		- ��ǰ ����: buyProduct(int ����) ���� ���
		- ����Ʈ ����: savePoint(int ����) 0% ���� �� ���� �Ϸ� ���
 * */

package CustomerManagement;


public class Customer {
	private static String cust_name;
	private static double bonus_point;
	// ������
	public Customer(){
		cust_name = "";
		bonus_point = 0;
	}
	public Customer(String name) {
		cust_name = name;
	}
	public Customer(int point) {
		bonus_point = point;
	}
	
	
	// ����� ���� �޼���
	public void buyProduct(int price) {
		System.out.println(price);
		savePoint(price, 0);
		
	}
	public void savePoint(double price, int percent) {
		double temp_point = price * percent * 0.01;
		bonus_point += temp_point;
		System.out.println(temp_point + "���� �����Ǿ����ϴ�.");
	}
	public double discount(int percent) {
		return percent * 0.01;
	}
	
}
