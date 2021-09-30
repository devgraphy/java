/*
 * Customer�� �θ� Ŭ����(����, ����) => �Ϲ����� Ŭ���� ����
 * ������ �ڽ� Ŭ������ �������� ����� ��� ����, �޼��带 �ۼ��Ѵ�.
 * */

package CustomerManagement;

public class Customer {
	// ��� ���� ���� => �ڽ�(����, ����) Ŭ�������� �������� ����� �Ӽ�
	protected int customerID;		// �� ���̵�
	protected String customerName;	// �� �̸�
	protected String customerGrade;	// �� ���
	protected int bonusPoint;		// ���ʽ� ����Ʈ
	protected double bonusRatio;		// ���ʽ� ����Ʈ ���� ����
	
	// ���ʽ� ����Ʈ�� õ ���� ���� �ĸ� �ֱ����� ���� ���� ����
	String bonusPoint_value;
	// ����Ʈ ������
	public Customer() {}
	
	
	// ������
	public Customer(int customerID, String customerName){
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = "GENERAL";		// �⺻ ����� "GENERAL"
		this.bonusPoint = 0;
		this.bonusRatio = 0.01;				// ����Ʈ �⺻ ���� ���� 1%�� ����
	}
	
	// ����� ���� �޼���
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;	// ���ʽ� ����Ʈ ���
		return price;
	}
	public String showCustomerInfo() {
		bonusPoint_value = Utils.toNumberFormat(bonusPoint);
		return customerName + "���� ����� " + customerGrade + "�̸� ���ʽ� ����Ʈ�� " + bonusPoint_value + "�Դϴ�.";
	}
	
}