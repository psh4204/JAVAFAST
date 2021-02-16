package stream.coffee;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee americano = new KenyaAmericano();
		americano.brweing();
		
		Coffee kenyaLatte = new Latte(new KenyaAmericano());
		kenyaLatte.brweing();
		
		
		// 끝까지 써보셈. 진짜 과관임.. 생성자(생성자(생성자())) 이런식으로 감.데코레이터패턴으로 IO구조를 쉽게 하기위해 만들어봄.
	}

}
