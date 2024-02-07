package ch11.string02.ch12.sec05;

import java.util.ArrayList;
import java.util.List;

class MyStringBuilder {
	private List<Character> chList = new ArrayList<>();
	
	public MyStringBuilder append(String str) {
		char[] chArr = str.toCharArray();
		for(char ch : chArr)
			chList.add(ch);
		return this;
	}
	public MyStringBuilder insert(int idx, String str) {
		char[] chArr = str.toCharArray();
		for(int i=idx; i<idx+str.length(); i++)
			chList.add(i, chArr[i]);
		return this;
	}
	public MyStringBuilder delete(int startIdx, int endIdx) {
		for(int i=startIdx; i<endIdx; i++)
			chList.remove(i);
		return this;
	}
	@Override
	public String toString() {
		String str = "";
		for(char ch : chList)
			str += ch;
		return str;
	}
	
}

class Human {
	private String name;
	private int age;
	private float height;
	private float weight;
	
	public Human() {}
	
	public Human(String name, int age, float height, float weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public Human setName(String name) {
		this.name = name;
		return this;
	}
	public Human setAge(int age) {
		this.age = age;
		return this;
	}
	public Human setHeight(float height) {
		this.height = height;
		return this;
	}
	public Human setWeight(float weight) {
		this.weight = weight;
		return this;
	}
	@Override
	public String toString() {
		return super.toString();
	}
	
}

public class StringBuilderExample {
	
	public static void main(String[] args) {
		//StringBuilder는 내부에 char[]로 문자열을 저장함
		String data = new StringBuilder()
				.append("DEF")
				.insert(0, "ABC")
				.delete(3, 4)
				.toString();
		System.out.println(data);
		
		String data1 = new MyStringBuilder()
				.append("def")
				.insert(0, "abc")
				.delete(3, 4)
				.toString();
		System.out.println(data1);
		
		Human human0 = new Human("홍길동", 21, 174.3f, 78.5f);
		System.out.println(human0);
		
		Human human1 = new Human()
						.setName("임꺽정")
						.setAge(30)
						.setHeight(178.3f)
						.setWeight(70.4f);
		System.out.println(human1);
	}

}
