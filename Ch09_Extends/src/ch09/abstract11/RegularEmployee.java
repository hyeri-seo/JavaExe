package ch09.abstract11;

//정규직
public class RegularEmployee extends Employee{
	
	protected int yearSalary;	//연봉
	protected int bonus;		//보너스

	public RegularEmployee(String empno, String name,
							int yearSalary, int bonus) {
		super(empno, name);	//Employee(empno, name) 호출
		this.yearSalary = yearSalary;
		this.bonus = bonus;
	}
	
	//부모의 기능 + 추가 확장
	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();	//Employee의 showEmployeeInfo 메서드 호출
		System.out.println("yearSalary:" + yearSalary);
		System.out.println("bonus:" + bonus);
		System.out.printf("monthPay: %.2f\n", getMonthPay());
		System.out.println("------------------");
	}

	@Override
	public double getMonthPay() {
		double mPay = (double)(yearSalary+bonus)/12;
		return mPay;
	}
	
}
