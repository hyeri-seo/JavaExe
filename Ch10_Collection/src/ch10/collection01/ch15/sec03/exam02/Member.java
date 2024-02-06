package ch10.collection01.ch15.sec03.exam02;

/*
 * Member 객체의 내용(이름, 나이)로 객체가 같은지 다른지 비교ㅏㅎ기 위해서는
 * Object로부터 상속받은 hashCode()와 equals()를 overriding해야 한다.
 * overriding하지 않으면 각각 개체의 해시값과 객체의 주소를 가지고 비교하지만
 * 아래처럼 overriding하면 객체 내의 필드 내용으로 비교한다.
 * 
 * 그러므로 주소록이나 이런 데이터를 저장할 땐느 아래처럼 하는 것이 필요하다.
 */

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//hashCode 재정의(주소를 hash화시켜서 만들어진 4byte 코드. 주소가 같으면 hash가 같게 나옴)
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}	//name과 age 값이 같으면 동일한 hashCode가 리턴됨
	
	//equals 재정의(물리적인 주소를 비교함)
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			return target.name.equals(name) && (target.age == age);
		} else {
			return false;
		}	//name과 age 값이 같으면 true가 리턴됨
	}
}
