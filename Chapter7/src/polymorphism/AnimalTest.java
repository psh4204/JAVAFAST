package polymorphism;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	public void readingBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�.");
	}
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("�������� �ϴ¤��� ���ư��ϴ�.");
	}
	public void flying() {
		System.out.println("�������� ���ƴٴմϴ�.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {

		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		/*
		//Human human = (Human)hAnimal; �ٿ�ĳ����_ �ش� Ŭ����(�ν��Ͻ�)�� ������ ����. �װ��� �ٿ�ĳ����.
		//instanceof�� �ٿ�ĳ���� �Ҷ� ������ ������ �� �ִ�.
		if(hAnimal instanceof Human) { // �� Ŭ������ ������ �� �ν��Ͻ��� �³�? ���� ����.
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
		animal.move(); //������ (polymorphism) .. �ϳ��� �ڵ尡 ���� �޼��带 ������ �� �ִ°�.
		// ����. �����ε� �� �޼��带 �� ������ ���� �ؾ��ϴ°� �ϳ��� �޼��带 ���� ���� ������.
		//--> ������ �޼������ �������̵� �Ǿ�����, ���� �ִϸ�(����Ŭ����)�Ҽ��̱� ������ �ٰ��� �ڵ� �ϳ��� ���� �����ǰ� �Ǿ������ϱ� �ٸ� ���� ȣ���.
	}
	
	
	// ���� . ��� -> ����ȯ -> �������̵� -> �����Լ� -> ���������� 

}
