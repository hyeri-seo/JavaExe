package ch02.logicOperator07;

public class LogicOperator {

	public static void main(String[] args) {
		boolean logic;
		
		//And 연산: 둘 다 참이어야 참
		logic = true && true;
		System.out.println("true && true => " + logic);		//true
		logic = true && false;
		System.out.println("true && false => " + logic); 	//false
		
		//Or 연산: 둘 중 하나라도 참이면 참
		logic = true || true;
		System.out.println("true || true => " + logic); 	//true
		logic = true || false;
		System.out.println("true || false => " + logic); 	//true
		
		//Xor 연산: 양쪽이 같으면 false, 다르면 true
		logic = true ^ true;
		System.out.println("true ^ true => " + logic); 		//false
		logic = true ^ false;
		System.out.println("true ^ false => " + logic); 	//true
		
		//Not 연산: true면 false, false면 true
		logic = !false;
		System.out.println("!false => " + logic);			//true
		logic = !true;
		System.out.println("!true => " + logic);			//false
	}

}
