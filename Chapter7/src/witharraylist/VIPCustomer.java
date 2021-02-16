package witharraylist;

public class VIPCustomer extends Customer {
	
	private int agentID;
	
	public VIPCustomer(int id, String name, int agetID) {
		this.id = id;
		this.customerName = name;
		this.bonusPercent = 0.1;
		this.bonusPoint = 0;
		this.agentID = agentID;
	}	

}
