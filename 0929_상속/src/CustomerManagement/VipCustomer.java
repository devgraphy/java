package CustomerManagement;

public class VipCustomer extends Customer {
	// Ŭ���� ����
	private static double saleRatio;
	private static int agentID;
	// ������
	public VipCustomer() {
		
	}
	public VipCustomer(int customerID, String customerName, int agentID) {
		super.customerID = customerID;
		super.customerName = customerName;
		super.bonusRatio = 0.05;
		this.agentID = agentID;
		this.saleRatio = 0.1;
	}
	
	// ����� �޼��� ����
	public int calcPrice(int price) {
		int temp_price = (int)(price*(1-saleRatio));
		super.bonusPoint+=temp_price*bonusRatio;
		return temp_price;
	}
	public void showCustomerInfo() {
		super.showCustomerInfo();
		System.out.println("���� ���η�: " + saleRatio);
		System.out.println("������Ʈ");
	}
	public int getAgentID() {
		return agentID;
	}
}
