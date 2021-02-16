package car;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		
		carList.add(new Sonata()); // 인스턴스 추가
		carList.add(new Avante()); // 인스턴스 추가
		carList.add(new Grandeur()); // 인스턴스 추가
		carList.add(new Genesis()); // 인스턴스 추가
		
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
