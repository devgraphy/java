package CustomerManagement;

public class CustomerTest {
	public static String price_value;
	public static void main(String[] args) {
		// Customer 객체 생성
		Customer customerPark = new Customer(1001, "파크");
		System.out.println(customerPark.showCustomerInfo());
		customerPark.calcPrice(100000);
		System.out.println(customerPark.showCustomerInfo());
		price_value = Utils.toNumberFormat(customerPark.calcPrice(200000));
		System.out.println("지불해야할 금액은 " + price_value + "입니다.");
		System.out.println();
		
		//VIP Customer 객체 생성
		VIPCustomer customerSon = new VIPCustomer(10020, "손흥민", 1234);
		customerSon.bonusPoint = 200;
		System.out.println(customerSon.showCustomerInfo());
		price_value = Utils.toNumberFormat(customerSon.calcPrice(500000));
		System.out.println("할인이 적용되어 지불해야할 금액은 " + price_value + "입니다.");
		int agentID =customerSon.getAgentID();
		System.out.println("담당 상담원 아이디는 " + agentID);
		
		//GOLD Customer 객체 생성
		GOLDCustomer customerLee = new GOLDCustomer(10050, "이몽룡");
		customerLee.bonusPoint = 50;
		System.out.println(customerLee.showCustomerInfo());
		int priceLee = customerLee.calcPrice(300000);
		price_value = Utils.toNumberFormat(priceLee);
		System.out.println("할인이 적용되어 지불해야할 금액은 " + price_value + "입니다.");

		
	}

}
