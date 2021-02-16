package pratice;


import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	private static final String List = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TravelCustomer customerL = new TravelCustomer("ÀÌ¼ø½Å", 40, 100);
		TravelCustomer customerK = new TravelCustomer("±è¾¾", 20, 100);
		TravelCustomer customerH = new TravelCustomer("È«¾¾", 30, 100);
		
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		customerList.add(customerL);
		customerList.add(customerK);
		customerList.add(customerH);
		
		System.out.println(customerList);
		
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println(total);
		
		customerList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));

	}

}
