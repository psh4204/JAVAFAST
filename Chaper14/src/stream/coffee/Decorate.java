package stream.coffee;

public abstract class Decorate  extends Coffee{ //굳이 안써도되는 abstract 쓰는 애들은 상속만 하기 위해 만드는 녀석들임.
	
	Coffee coffee;
	public Decorate(Coffee coffee) {
		this.coffee = coffee;
	}
	@Override
	public void brweing() {
		coffee.brweing();
	}

}
