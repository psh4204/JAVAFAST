package set;

import treeset.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemverHashSet manager = new MemverHashSet();
		
		Member memberLee = new Member(100, "Lee");
		Member memberK = new Member(200, "K");
		Member memberP = new Member(300, "P");
		
		
		manager.addMember(memberLee);
		manager.addMember(memberK);
		manager.addMember(memberP);
		
		manager.showAllMember();
		
		
	}

}
