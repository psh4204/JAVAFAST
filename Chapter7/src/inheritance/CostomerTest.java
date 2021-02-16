package inheritance;

public class CostomerTest {

	public static void main(String[] args) {
		/*
		Customer customerLee = new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint  = 1000;
		customerLee.showCustomerInfo();
		*/
		
		VipCustomer customerKim = new VipCustomer();
		customerKim.setCustomerName("이순신");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint  = 10000;
		customerKim.showCustomerInfo();
		
	}

}
