package ch09.Resolve07.Resolve2;

public class Triangle {
	
	public int width, height;
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
		System.out.println("Triangle 생성자 실행");
	}
	
	public void setTriangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int calArea(Triangle triangle) {
		return width * height;
	}
}
