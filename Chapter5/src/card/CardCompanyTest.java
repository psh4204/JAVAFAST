package card;

public class CardCompanyTest {

	public static void main(String[] args) {

		CardCompany company = CardCompany.getInstance(); // �̱��� ����. �ϳ����� ȸ�� ����
		
		Card myCard = company.creatCard();
		Card yourCard = company.creatCard();
		
		System.out.println(myCard.getCardNumber()); //10001 ���
		System.out.println(yourCard.getCardNumber()); //10002 ���
		
	}

}
