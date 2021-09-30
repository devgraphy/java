package CustomerManagement;

public class VipCustomer extends Customer {
	// 클래스 변수
	private static double saleRatio;
	private static int agentID;
	// 생성자
	public VipCustomer() {
		
	}
	public VipCustomer(int customerID, String customerName, int agentID) {
		super.customerID = customerID;
		super.customerName = customerName;
		super.bonusRatio = 0.05;
		this.agentID = agentID;
		this.saleRatio = 0.1;
	}
	
	// 사용자 메서드 생성
	public int calcPrice(int price) {
		int temp_price = (int)(price*(1-saleRatio));
		super.bonusPoint+=temp_price*bonusRatio;
		return temp_price;
	}
	public void showCustomerInfo() {
		super.showCustomerInfo();
		System.out.println("구매 할인률: " + saleRatio);
		System.out.println("에이전트");
	}
	public int getAgentID() {
		return agentID;
	}
}
