package treeset;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberTreeSet manager = new MemberTreeSet();
		
		Member memberLee = new Member(100, "Lee");
		Member memberK = new Member(200, "K");
		Member memberP = new Member(300, "P");
		
		
		manager.addMember(memberLee);
		manager.addMember(memberK);
		manager.addMember(memberP);
		
		manager.showAllMember();
		
	}

}
