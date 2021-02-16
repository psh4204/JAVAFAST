package car;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		
		carList.add(new Sonata()); // �ν��Ͻ� �߰�
		carList.add(new Avante()); // �ν��Ͻ� �߰�
		carList.add(new Grandeur()); // �ν��Ͻ� �߰�
		carList.add(new Genesis()); // �ν��Ͻ� �߰�
		
		for(Car c : carList) {
			if( c instanceof Sonata) {
				c.run();
			}
			else if( c instanceof Avante) {
				c.run();
			}
			else if( c instanceof Grandeur) {
				c.run();
			}
			else if( c instanceof Genesis) {
				c.run();
			}
			else {
				System.out.println("instanceErr");
			}
			System.out.println("=================");
		}
	}

}
