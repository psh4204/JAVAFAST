package stream.coffee;

public class Latte extends Decorate {

	public Latte(Coffee coffee) {  //하나의 커피를 꼭 가지고오게되죠?
		super(coffee);
	}
	@Override
	public void brweing() {
		// TODO Auto-generated method stub
		super.brweing(); //상위클래스에 제조하는벙 호출하구~
		System.out.print(" 우유퐁당");
	}
}
