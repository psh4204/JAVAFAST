package array;

public class Subject {
	//클래스 할때 서브잭트 사용하는거 좋음. 자주쓰는 매서드를 한곳에 저장하기 편해서 인거 같음.
	
	
	private String name;
	private int score;
	
	public Subject(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}
