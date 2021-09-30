package CustomerManagement;
public class Customer {
	protected static int customerID;
	protected static String customerName;
	protected static String customerGrade;
	protected static int bonusPoint;
	protected static double bonusRatio;
	
	// 생성자
	public Customer() {
		
	}
	
	public Customer(int customerID, String customerName){
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = "GENERAL";
		this.bonusPoint = 0;
		this.bonusRatio = 0.01;
	}
	
	// 사용자 정의 메서드
	public int calcPrice(int price) {
		return price;
	}
	public void showCustomerInfo() {
		System.out.println("===<고객 정보>===");
		System.out.println("고객ID: " + this.customerID);
		System.out.println("고객이름: " + this.customerName);
		System.out.println("고객등급: "+ this.customerGrade);
		System.out.println("고객포인트: " + this.bonusPoint);
		System.out.println("보너스적립률: " + this.bonusRatio);
	}
	
}