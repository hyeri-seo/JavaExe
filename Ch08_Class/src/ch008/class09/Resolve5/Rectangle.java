package ch008.class09.Resolve5;

public class Rectangle {
	private int x1, y1, x2, y2;
	
	public Rectangle() {}
	
	public void set(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public int square(Rectangle r) {
		int area = ((r.x1 - r.x2)*(r.x1 - r.x2) + (r.y1 - r.y2)*(r.y1 - r.y2))/2;
		return area;
	}
	
	public void show() {
		System.out.printf("직삭각형을 이루고 있는 점1의 좌표:(%d, %d)\n", x1, y1);
		System.out.printf("직삭각형을 이루고 있는 점2의 좌표:(%d, %d)\n", x2, y2);
		System.out.println("사각형의 넓이 = " 
		+ ((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2))/2);
	}
	
	public boolean equals(Rectangle r) {
		if(r.x1 == x1 && r.y1 == y1 &&
				r.x2 == x2 && r.y2 == y2) return true;
		else return false;
	}
}
