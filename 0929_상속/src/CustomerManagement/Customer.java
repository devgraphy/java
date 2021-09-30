/*
 * Customer는 부모 클래스(상위, 슈퍼) => 일반적인 클래스 성격
 * 앞으로 자식 클래스와 공통으로 사용할 멤버 변수, 메서드를 작성한다.
 * */

package CustomerManagement;

public class Customer {
	// 멤버 변수 선언 => 자식(하위, 서브) 클래스에서 공통으로 사용할 속성
	protected int customerID;		// 고객 아이디
	protected String customerName;	// 고객 이름
	protected String customerGrade;	// 고객 등급
	protected int bonusPoint;		// 보너스 포인트
	protected double bonusRatio;		// 보너스 포인트 적립 비율
	
	// 보너스 포인트가 천 단위 마다 컴마 넣기위한 전역 변수 선언
	String bonusPoint_value;
	// 디폴트 생성자
	public Customer() {}
	
	
	// 생성자
	public Customer(int customerID, String customerName){
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = "GENERAL";		// 기본 등급은 "GENERAL"
		this.bonusPoint = 0;
		this.bonusRatio = 0.01;				// 포인트 기본 적립 비율 1%로 지정
	}
	
	// 사용자 정의 메서드
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;	// 보너스 포인트 계산
		return price;
	}
	public String showCustomerInfo() {
		bonusPoint_value = Utils.toNumberFormat(bonusPoint);
		return customerName + "님의 등급은 " + customerGrade + "이며 보너스 포인트는 " + bonusPoint_value + "입니다.";
	}
	
}