package card;

public class CardCompanyTest {

	public static void main(String[] args) {

		CardCompany company = CardCompany.getInstance(); // 싱글톤 패턴. 하나뿐인 회사 구현
		
		Card myCard = company.creatCard();
		Card yourCard = company.creatCard();
		
		System.out.println(myCard.getCardNumber()); //10001 출력
		System.out.println(yourCard.getCardNumber()); //10002 출력
		
	}

}
