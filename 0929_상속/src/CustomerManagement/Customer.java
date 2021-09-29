/*
 - 속성: cust_name, bonus_point, consultant
 - 기능: 제품 구매, 포인트 적립, 상담원 배정(Vip에게만 해당)
		- 제품 구매: buyProduct(int 가격) 가격 출력
		- 포인트 적립: savePoint(int 가격) 0% 적립 후 적립 완료 출력
 * */

package CustomerManagement;


public class Customer {
	private static String cust_name;
	private static double bonus_point;
	// 생성자
	public Customer(){
		cust_name = "";
		bonus_point = 0;
	}
	public Customer(String name) {
		cust_name = name;
	}
	public Customer(int point) {
		bonus_point = point;
	}
	
	
	// 사용자 정의 메서드
	public void buyProduct(int price) {
		System.out.println(price);
		savePoint(price, 0);
		
	}
	public void savePoint(double price, int percent) {
		double temp_point = price * percent * 0.01;
		bonus_point += temp_point;
		System.out.println(temp_point + "원이 적립되었습니다.");
	}
	public double discount(int percent) {
		return percent * 0.01;
	}
	
}
