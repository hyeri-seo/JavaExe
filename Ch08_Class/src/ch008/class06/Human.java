package ch008.class06;

/*
 * 클래스로 묶은 변수를 쉽게 접근 허용하는 것은
 * 프로그래밍의 오류를 가져오게 되는 중대한 원인이 된다는 사실을
 * 경험적으로 알게 되었다.
 * 
 * 그래서 클래스 내부에서만 사용한다는 개념(private)과
 * 밖에서도 접근한다(public)는 개념이 등장하게 되었다.
 * 
 * [객체 지향의 기본 원칙]
 * 필드 변수: private을 해주는 관습이 있다. (외부 직접 접근 불허)
 * 메서드: public을 해주는 관습이 있다. (외부 사용을 전제로)
 */

public class Human {
	private String name;
	private int age;
	private double score;
	
	//Getter
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getScore() {
		return score;
	}
	
	//Setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if(age < 0) return;	//void형일 때 return은 끝낸다는 의미
		this.age = age;
	}
	
	public void setScore(double score) {
		if(score < 0) return;
		this.score = score;
	}
}
