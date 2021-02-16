package hashmap;

public class MemberHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberHashMap manager = new MemberHashMap();
		
		Member memberLee = new Member(100, "Lee");
		Member memberK = new Member(200, "K");
		Member memberP = new Member(300, "P");
		Member memberS = new Member(300, "P");
		
		
		manager.addMember(memberLee);
		manager.addMember(memberK);
		manager.addMember(memberP);
		manager.addMember(memberS);
		
		manager.showAllMember();
		
	}

}
