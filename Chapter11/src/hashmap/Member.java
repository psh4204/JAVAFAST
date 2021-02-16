package hashmap;

import java.util.Comparator;

public class Member implements Comparator<Member> {
	private int memberId;
	private String memberName;
	
	public Member(){}
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName= memberName;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName + "회원님의 ID" +memberId+ "입니다.";
	}
	
	
	
	
	/*    implements Comparable<Member>
	@Override
	public int compareTo(Member member) {

		//return (this.memberId - member.memberId); // 양수를 반환하게 되면 오름차순으로 정렬됨. (-1) 뒤에 곱하면  내림차순으로 됨
		return this.memberName.compareTo(member.getMemberName());  //compareTo(String) 매소드를 이용하면 또 String으로 정렬됨.
	}
	*/
	
	@Override
	public int compare(Member member1, Member member2) { //1은 this 2는 매게변수
		
		return (this.memberId - member2.memberId);
	}
	
	
	
	
	
	
	
	
}
