package polymorphism;

public class VipCustomer extends Customer{
	
	private int agentID;
	double saleRatio;
	
	public VipCustomer(int ID, String name) {
		
		customerGrade = "VIP";  //protected ���������ڸ� �����.
		bonusRatio = 0.05;
		saleRatio = 0.1;

		customerID = ID;
		customerName = name;
		System.out.println("VipCustomer() ������ ȣ��");
	}

	@Override   //�������̼�
	public int calcPrice(int price) {
		// TODO Auto-generated method stub

		bonusPoint+= price *bonusRatio;
		return price -(int)(price * saleRatio);
	}
	
	
	
}
