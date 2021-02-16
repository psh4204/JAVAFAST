package witharraylist;

public class Customer {
	protected int id;
	protected int bonusPoint;
	protected double bonusPercent;
	protected String customerName;
	protected int cost;
	
	public Customer() {
		this.bonusPercent = 0.01;
		this.bonusPoint = 0;
	}

	public Customer(int id, String name) {
		this.id = id;
		this.customerName = name;
		this.bonusPercent = 0.01;
		this.bonusPoint = 0;
	}

	public int calcPrice(int price) {
		this.bonusPoint = (int)(price * bonusPercent);
		return cost;
	}
	
	public String showCustomerInfo() {
		return "이름 : "+ customerName + ", 포인트 : "+ bonusPoint;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusPercent() {
		return bonusPercent;
	}

	public void setBonusPercent(double bonusPercent) {
		this.bonusPercent = bonusPercent;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	

}
