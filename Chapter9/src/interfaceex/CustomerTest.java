package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order(); //디폴트 되어도 재정의된거로 됨. 상위꺼 불러와도 지금 가장 하위에서 만든 녀석꺼 씀.!!!!!!!!!
		
		
		
	}

}
