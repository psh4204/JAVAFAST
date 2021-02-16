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
		return memberName + "ȸ������ ID" +memberId+ "�Դϴ�.";
	}
	
	
	
	
	/*    implements Comparable<Member>
	@Override
	public int compareTo(Member member) {

		//return (this.memberId - member.memberId); // ����� ��ȯ�ϰ� �Ǹ� ������������ ���ĵ�. (-1) �ڿ� ���ϸ�  ������������ ��
		return this.memberName.compareTo(member.getMemberName());  //compareTo(String) �żҵ带 �̿��ϸ� �� String���� ���ĵ�.
	}
	*/
	
	@Override
	public int compare(Member member1, Member member2) { //1�� this 2�� �ŰԺ���
		
		return (this.memberId - member2.memberId);
	}
	
	
	
	
	
	
	
	
}
