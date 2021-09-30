/*
 * Customer 클래스를 상속받고 VIP 고객에게 필요한 추가 '속성'과 '기능'을 구현한다.
 * */
package CustomerManagement;

public class VIPCustomer extends Customer {
	// 클래스 변수
	private double saleRatio;	// 할인률
	private int agentID;			// VIP 고객 담당 상담원 아이디
	// 생성자
	public VIPCustomer() {
		
	}
	public VIPCustomer(int customerID, String customerName, int agentID) {
		// 부모 클래스 생성자 호출, [주의] super()는 반드시 첫 라인에 기술한다.
		super(customerID, customerName);
		bonusRatio = 0.05;
		customerGrade = "VIP";
		this.saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	// 사용자 메서드 생성
	@Override	// 재정의: 다형성 개념 - 메소드 오버라이딩을 통해 다형성을 구현할 수 있다.
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatio;
		return (int)(price*(1-saleRatio));
	}

	public int getAgentID() {
		return agentID;
	}
}