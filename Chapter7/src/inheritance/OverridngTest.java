package inheritance;

public class OverridngTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customerLee = new Customer(10010, "�̼���");
		
		customerLee.bonusPoint  = 1000;
	
		
		VipCustomer customerKim = new VipCustomer(10020, "������");
		
		customerKim.bonusPoint  = 10000;
		
		
		int priceLee  = customerLee.calcPrice(10000);
		int priceKim  = customerKim.calcPrice(10000);
		
		customerLee.showCustomerInfo();
		customerKim.showCustomerInfo();
		
		
		
		System.out.println(customerLee.showCustomerInfo()+"���ұݾ���" + priceLee +"�� �Դϴ�.");
		System.out.println(customerKim.showCustomerInfo()+"���ұݾ���" + priceKim +"�� �Դϴ�.");
		
		

	}

}
