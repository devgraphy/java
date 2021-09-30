package CustomerManagement;

public class CustomerTest {
	public static String price_value;
	public static void main(String[] args) {
		// Customer ��ü ����
		Customer customerPark = new Customer(1001, "��ũ");
		System.out.println(customerPark.showCustomerInfo());
		customerPark.calcPrice(100000);
		System.out.println(customerPark.showCustomerInfo());
		price_value = Utils.toNumberFormat(customerPark.calcPrice(200000));
		System.out.println("�����ؾ��� �ݾ��� " + price_value + "�Դϴ�.");
		System.out.println();
		
		//VIP Customer ��ü ����
		VIPCustomer customerSon = new VIPCustomer(10020, "�����", 1234);
		customerSon.bonusPoint = 200;
		System.out.println(customerSon.showCustomerInfo());
		price_value = Utils.toNumberFormat(customerSon.calcPrice(500000));
		System.out.println("������ ����Ǿ� �����ؾ��� �ݾ��� " + price_value + "�Դϴ�.");
		int agentID =customerSon.getAgentID();
		System.out.println("��� ���� ���̵�� " + agentID);
		
		//GOLD Customer ��ü ����
		GOLDCustomer customerLee = new GOLDCustomer(10050, "�̸���");
		customerLee.bonusPoint = 50;
		System.out.println(customerLee.showCustomerInfo());
		int priceLee = customerLee.calcPrice(300000);
		price_value = Utils.toNumberFormat(priceLee);
		System.out.println("������ ����Ǿ� �����ؾ��� �ݾ��� " + price_value + "�Դϴ�.");

		
	}

}
