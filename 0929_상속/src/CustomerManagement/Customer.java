package CustomerManagement;
public class Customer {
	protected static int customerID;
	protected static String customerName;
	protected static String customerGrade;
	protected static int bonusPoint;
	protected static double bonusRatio;
	
	// ������
	public Customer() {
		
	}
	
	public Customer(int customerID, String customerName){
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = "GENERAL";
		this.bonusPoint = 0;
		this.bonusRatio = 0.01;
	}
	
	// ����� ���� �޼���
	public int calcPrice(int price) {
		return price;
	}
	public void showCustomerInfo() {
		System.out.println("===<�� ����>===");
		System.out.println("��ID: " + this.customerID);
		System.out.println("���̸�: " + this.customerName);
		System.out.println("�����: "+ this.customerGrade);
		System.out.println("������Ʈ: " + this.bonusPoint);
		System.out.println("���ʽ�������: " + this.bonusRatio);
	}
	
}