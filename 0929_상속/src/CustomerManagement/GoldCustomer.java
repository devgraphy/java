package CustomerManagement;

public class GoldCustomer extends Customer{
	// 클래스 변수
	protected static double saleRatio;
	// 생성자
	public GoldCustomer(int customerID, String customerName) {
		super.customerID = customerID;
		super.customerName = customerName;
		super.bonusRatio = 0.02;
		this.saleRatio = 0.1;
	}
	public GoldCustomer(int customerID, String customerName, double bonusRatio) {
		super.customerID = customerID;
		super.customerName = customerName;
		super.bonusRatio = bonusRatio;
		this.saleRatio = 0.1;
	}
	public GoldCustomer(int customerID, String customerName, double bonusRatio, double saleRatio) {
		super.customerID = customerID;
		super.customerName = customerName;
		super.bonusRatio = bonusRatio;
		this.saleRatio = saleRatio;
	}
	public int calcPrice(int price) {
		int temp_price = (int)(price*(1-saleRatio));
		super.bonusPoint+=temp_price*bonusRatio;		
		return temp_price;
	}
	
}