package stream.coffee;

public abstract class Decorate  extends Coffee{ //���� �Ƚᵵ�Ǵ� abstract ���� �ֵ��� ��Ӹ� �ϱ� ���� ����� �༮����.
	
	Coffee coffee;
	public Decorate(Coffee coffee) {
		this.coffee = coffee;
	}
	@Override
	public void brweing() {
		coffee.brweing();
	}

}
