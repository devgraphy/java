/*
 Vip
	- 추가 속성: x
	- 변경 기능: 
		- 제품 구매: buyProduct(int 가격) 10%할인된 가격 출력
		- 포인트 적립: savePoint(int 가격) 5% 적립 후 적립 완료 출력
	- 추가 기능:
		- 상담원 배정: alignConsultant("상담원 이름") 값 변경
 * */
package CustomerManagement;

public class Vip extends Customer {
	// 클래스 변수
	
	// 사용자 메서드 생성
	public void buyProduct(int price) {
		double last_price = price * (1-discount(10));
		System.out.println(price * (1-discount(10)) + "원 어치를 구매하셨습니다.");
		savePoint(last_price, 5);
	}
	public void alignConsultant(String name) {
		
	}

}
