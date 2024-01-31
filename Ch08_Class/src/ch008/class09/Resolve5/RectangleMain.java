package ch008.class09.Resolve5;
//5. Rectangle클래스를 작성하세요
//int타입의 x1, y1, x2, y2 : 사각형을 구성하는 두 점의 좌표
//void set(int x1, int y1, int x2, int y2) : 좌표 설정
//int square() : 사각형 넓이 리턴
//void show() : 좌표와 넓이 등 직사각형 정보의 화면 출력
//boolean equals(Rectangle r) : 인자로 전달된 객체 r과 현 객체가 동일한 좌표의 직사각형이면 true 리턴
public class RectangleMain {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		Rectangle r3 = new Rectangle();
		
		r1.set(1, 2, 3, 4);
		r1.square(r1);
		r1.show();
		
		System.out.println();
		
		r2.set(1, 2, 3, 4);
		r3.set(2, 3, 4, 5);
		r1.equals(r2);
		r1.equals(r3);
		System.out.println(r1.equals(r2));
		System.out.println(r1.equals(r3));
		
	}
}
