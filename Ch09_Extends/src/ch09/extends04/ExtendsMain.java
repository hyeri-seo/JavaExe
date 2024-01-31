package ch09.extends04;

public class ExtendsMain {
	public static void main(String[] args) {
		Child child = new Child(7, 999999999L, 72);
		
		System.out.println();
		
		//메소드의 상속
		child.play();
		child.wealth();
		child.handsome();
		
		System.out.println();
		
		//필드의 상속
		System.out.println("잘생김 점수: " + child.handsomeScore);
		System.out.println("돈: " + child.money);
		System.out.println("즐거운 날: " + child.day);
	}
}
