package exception;



public class IDFormatTest {
	
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException{
		
		if(userID == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다."); //throws 는 예외를 미루는것. throw는 예외를 내는것
		}
		else if(userID.length()< 8 || userID.length()>20) {
			throw new IDFormatException("아이디는 8글자 이상 20글자 이하로 쓰세요."); //throws 는 예외를 미루는것. throw는 예외를 내는것
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDFormatTest idTest = new IDFormatTest();
		
		String myId = null;
		
		try {
			idTest.setUserID(myId);
		}catch (IDFormatException e ) {
			System.out.println(e);
		}
		
	}

}
