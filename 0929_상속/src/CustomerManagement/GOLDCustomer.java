package CustomerManagement;

public class GOLDCustomer extends Customer{
	// 클래스 변수
	protected static double saleRatio;
	// 생성자
	public GOLDCustomer(int customerID, String customerName) {
		super.customerID = customerID;
		super.customerName = customerName;
		super.customerGrade = "GOLD";
		super.bonusRatio = 0.02;
		this.saleRatio = 0.1;
	}
	@Override	// 재정의: 다형성 개념 - 메소드 오버라이딩을 통해 다형성을 구현할 수 있다.
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatio;
		return (int)(price*(1-saleRatio));
	}
	
}