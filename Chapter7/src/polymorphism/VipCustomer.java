package polymorphism;

public class VipCustomer extends Customer{
	
	private int agentID;
	double saleRatio;
	
	public VipCustomer(int ID, String name) {
		
		customerGrade = "VIP";  //protected 접근제한자를 사용함.
		bonusRatio = 0.05;
		saleRatio = 0.1;

		customerID = ID;
		customerName = name;
		System.out.println("VipCustomer() 생성자 호출");
	}

	@Override   //에너테이션
	public int calcPrice(int price) {
		// TODO Auto-generated method stub

		bonusPoint+= price *bonusRatio;
		return price -(int)(price * saleRatio);
	}
	
	
	
}
