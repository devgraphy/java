/*
 * Customer Ŭ������ ��ӹް� VIP ������ �ʿ��� �߰� '�Ӽ�'�� '���'�� �����Ѵ�.
 * */
package CustomerManagement;

public class VIPCustomer extends Customer {
	// Ŭ���� ����
	private double saleRatio;	// ���η�
	private int agentID;			// VIP �� ��� ���� ���̵�
	// ������
	public VIPCustomer() {
		
	}
	public VIPCustomer(int customerID, String customerName, int agentID) {
		// �θ� Ŭ���� ������ ȣ��, [����] super()�� �ݵ�� ù ���ο� ����Ѵ�.
		super(customerID, customerName);
		bonusRatio = 0.05;
		customerGrade = "VIP";
		this.saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	// ����� �޼��� ����
	@Override	// ������: ������ ���� - �޼ҵ� �������̵��� ���� �������� ������ �� �ִ�.
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatio;
		return (int)(price*(1-saleRatio));
	}

	public int getAgentID() {
		return agentID;
	}
}