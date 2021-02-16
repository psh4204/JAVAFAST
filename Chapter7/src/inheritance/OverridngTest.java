package inheritance;

public class OverridngTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customerLee = new Customer(10010, "이순신");
		
		customerLee.bonusPoint  = 1000;
	
		
		VipCustomer customerKim = new VipCustomer(10020, "김유신");
		
		customerKim.bonusPoint  = 10000;
		
		
		int priceLee  = customerLee.calcPrice(10000);
		int priceKim  = customerKim.calcPrice(10000);
		
		customerLee.showCustomerInfo();
		customerKim.showCustomerInfo();
		
		
		
		System.out.println(customerLee.showCustomerInfo()+"지불금액은" + priceLee +"원 입니다.");
		System.out.println(customerKim.showCustomerInfo()+"지불금액은" + priceKim +"원 입니다.");
		
		

	}

}
