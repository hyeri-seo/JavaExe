package ch09.interface12;
/*
 * 인터페이스 == 추상클래스
 * 모든 메서드가 추상메서드
 * 
 * 1) 상속을 전제로 함
 * 2) 부모의 인터페이스 변수에 자식 객체를 저장할 수 있음
 * 3) 다형성의 의미(묶어서 관리 쉬움, 각 변수는 저장 객체에 다라 각각 개성있게 동작)
 * 4) 클래스와 클래스를 연결
 * 5) 유연한 설계
 * 6) Design Pattern
 * 7) literal constant value(숫자) => 의미 있는 문자열 constant
 * 
 */
public interface StarUnit {
	public void walk();
	public void attack();
	public void die();
}