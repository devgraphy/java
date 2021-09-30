package CustomerManagement;

public class GOLDCustomer extends Customer{
	// Ŭ���� ����
	protected static double saleRatio;
	// ������
	public GOLDCustomer(int customerID, String customerName) {
		super.customerID = customerID;
		super.customerName = customerName;
		super.customerGrade = "GOLD";
		super.bonusRatio = 0.02;
		this.saleRatio = 0.1;
	}
	@Override	// ������: ������ ���� - �޼ҵ� �������̵��� ���� �������� ������ �� �ִ�.
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatio;
		return (int)(price*(1-saleRatio));
	}
	
}