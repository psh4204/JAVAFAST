package template;

public class AiCar extends Car {

	@Override
	public void drive() {
		System.out.println("지울 주행합니다.");
		System.out.println("자동차가 스스로 방향을 바꿉니다..");
		
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다..");
		
	}
	
	

}
