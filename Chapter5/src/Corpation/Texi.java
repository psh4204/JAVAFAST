package Corpation;

public class Texi {

		int texiNumber;
		int passengerCount;
		int money;
		
		public Texi(int texiNumber) {
			this.texiNumber = texiNumber;
		}
		
		public void take(int money) { //승차 메서드
			this.money += money;
			passengerCount++;
		}
		
		public void showTexiInfo(){
			System.out.println(texiNumber + "번의 택시의 승객은" + passengerCount + "명 이고, 수입은"+ this.money + "입니다");
		}
}
