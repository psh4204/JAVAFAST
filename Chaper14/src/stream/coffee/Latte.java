package stream.coffee;

public class Latte extends Decorate {

	public Latte(Coffee coffee) {  //�ϳ��� Ŀ�Ǹ� �� ��������Ե���?
		super(coffee);
	}
	@Override
	public void brweing() {
		// TODO Auto-generated method stub
		super.brweing(); //����Ŭ������ �����ϴº� ȣ���ϱ�~
		System.out.print(" ��������");
	}
}
