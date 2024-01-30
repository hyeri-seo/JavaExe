package ch07.enum01.ch05.se12;

/*
 * 인터페이스의 용법 중에는 상수를 만들 대 사용하는 것도 있다.
 * 상수는 일반적으로 대문자로 쓰는 것이 관례이다.
 */

public interface Menu {
	//리터럴 상수 값을 상수로 치환
	//우리가 Menu.ZZAMPONG 이런 식으로 쓰는 게
	//컴파일러는 숫자 2로 인식함
	int ZZAJANGMYUN = 1;
	int ZZAMPONG = 2;
	int TANGSOOYOOK = 3;
	int YOOSANSEUL = 4;
	int YOOLINGI = 5;
}
