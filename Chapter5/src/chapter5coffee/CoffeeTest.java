package chapter5coffee;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee kong = new Coffee("KONG", 200000, 0);
		Coffee star = new Coffee("STAR", 200000, 0);
		
		System.out.println("========================");
		
		People sihwan = new People("SIHWAN", 30000);
		People meow = new People("MEOW", 30000000);
		
		sihwan.buyCoffee(star, "americano", 2);
		meow.buyCoffee(kong, "sihwanChew", 30);
		
		System.out.println("========================");
		
		kong.showCoffee();
		star.showCoffee();
		
		System.out.println("========================");
		
		sihwan.showPeople();
		meow.showPeople();
		
		System.out.println("========================");
		
	}

}
