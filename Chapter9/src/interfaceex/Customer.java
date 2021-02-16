package interfaceex;

public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("cutomer sell");
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("cutomer buy");
	}
	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("customer order");
	}
	

}
