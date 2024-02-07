package ch12.object01.ch12.sec03.exam01;

public class EqualsExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		//toString() 재정의 안 하고 그냥 equals를 쓰면 false로 나옴
		//obj1과 obj2는 객체가 다르기 때문에..
		if(obj1.equals(obj2)) {	//true
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) {	//false
			System.out.println("obj1과 obj3은 동등합니다.");
		} else {
			System.out.println("obj1과 obj3은 동등하지 않습니다.");
		}
	}

}
