package template;

public class ManualCar extends Car{
	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 방향을 바꿉니다..");
		
	}

	@Override
	public void stop() {
		System.out.println("시동을 멈춥니다..");
		
	}
				
}

