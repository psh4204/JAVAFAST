package polymorphism;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	public void readingBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하는ㄹ을 날아갑니다.");
	}
	public void flying() {
		System.out.println("독수리가 날아다닙니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {

		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		/*
		//Human human = (Human)hAnimal; 다운캐스팅_ 해당 클래스(인스턴스)로 내리는 것임. 그것이 다운캐스팅.
		//instanceof로 다운캐스팅 할때 오류를 조심할 수 있다.
		if(hAnimal instanceof Human) { // 이 클래스가 정말로 이 인스턴스가 맞냐? 묻는 것임.
			Human human=(Human) hAnimal;
			human.readingBook();
		}
		*/
		
		AnimalTest test = new AnimalTest();
		
		
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		test.testDownCasting(animalList);
		
		
		/*
		for(Animal animal : animalList) {
			animal.move();
		
		}*/
		
		
		
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		for(int i = 0; i<list.size();i++) {
			Animal animal = list.get(i);
			
			if (animal instanceof Human) {
				Human human = (Human)animal;
				human.readingBook();
			}
			else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
			else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}
			else {
				System.out.println("error");
			}
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move(); //다형성 (polymorphism) .. 하나의 코드가 여러 메서드를 실행할 수 있는것.
		// 장점. 오버로딩 시 메서드를 꼭 세개를 만들어서 해야하는걸 하나의 메서드를 만들어서 구현 가능함.
		//--> 각각의 메서드들이 오버라이딩 되었지만, 전부 애니멀(상위클래스)소속이기 때문에 다같은 코드 하나로 전부 재정의가 되어있으니까 다른 것이 호출됨.
	}
	
	
	// 정리 . 상속 -> 형변환 -> 오버라이딩 -> 가상함수 -> 폴리모피즘 

}
