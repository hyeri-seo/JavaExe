package ch09.resolve14;

import java.util.Scanner;

public class Exit implements IQuestionAnswer {

	@Override
	public void question() {
		String question = "4. 프로그램 종료";
		System.out.println(question);
	}

	@Override
	public void answer(Scanner sc) {
		
	}

	@Override
	public boolean isRun() {
		return false;
	}

}
