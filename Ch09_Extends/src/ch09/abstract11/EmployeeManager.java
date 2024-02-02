package ch09.abstract11;

import java.util.Scanner;

public class EmployeeManager {
	private final int EMP_NUM = 100;	//관리할 수 있는 최대 사원의 수
	// Employee의 자식 객체들을 저장
	private Employee[] empArr = new Employee[EMP_NUM];
	private int numOfEmp = 0;			//저장된 사원 객체 수, 다음 사원이 저장될 index
	private Scanner sc = new Scanner(System.in);
	
	private int viewMenu() {
		System.out.println("[ 사원 선택 ]");
		System.out.println("1. 정규직");
		System.out.println("2. 임시직");
		System.out.println("3. 일용직");
		System.out.println("4. 전체정보보기");
		System.out.println("5. 종료");
		System.out.print("번호 입력 >> ");
		int sel = sc.nextInt();
		return sel;
	}
	
	private RegularEmployee createRegularEmployee() {
		System.out.println("------------------");
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("연봉 >> ");
		int yearSalary = sc.nextInt();
		System.out.print("보너스 >> ");
		int bonus = sc.nextInt();
		System.out.println("------------------");
		RegularEmployee regEmp = 
				new RegularEmployee(empno, name, yearSalary, bonus);
		return regEmp;
	}
	
	private TempEmployee createTempEmployee() {
		System.out.println("------------------");
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("연봉 >> ");
		int yearSalary = sc.nextInt();
		System.out.print("계약 기간 >> ");
		int hireYear = sc.nextInt();
		System.out.println("------------------");
		TempEmployee tempEmp = 
				new TempEmployee(empno, name, yearSalary, hireYear);
		return tempEmp;
	}
	
	private PartTimeEmployee createPartTimeEmployee() {
		System.out.println("------------------");
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("일급 >> ");
		int dailyPay = sc.nextInt();
		System.out.print("근무 일수 >> ");
		int workDay = sc.nextInt();
		System.out.println("------------------");
		PartTimeEmployee ptEmp = 
				new PartTimeEmployee(empno, name, dailyPay, workDay);
		return ptEmp;
	}
	
	private boolean saveEmployee(Employee emp) {
		boolean isSave =true;
		
		if(this.numOfEmp < EMP_NUM) {
			this.empArr[this.numOfEmp] = emp;
			this.numOfEmp ++;
			isSave = true;
		} else {
			isSave = false;
		}
		return isSave;
	}
	
	private void viewAllEmployeeInfo() {
		for(int i=0; i<this.numOfEmp; i++) {
			this.empArr[i].showEmployeeInfo();
		}
	}
	
	public void run() {
		boolean isRun = true;
		Employee emp = null;
		while(isRun) {
			int selNum = viewMenu();
			switch(selNum) {
			case EmpMenu.REG_EMP :
				emp = createRegularEmployee();
				break;
			case EmpMenu.TEMP_EMP :
				emp = createTempEmployee();
				break;
			case EmpMenu.PART_EMP :
				emp = createPartTimeEmployee();
				break;
			case EmpMenu.ALL_INFO :
				emp = null;
				viewAllEmployeeInfo();;
				break;
			case EmpMenu.EXIT :
				emp = null;
				isRun = false;
				break;
			default :
				emp = null;
				System.out.println("해당 항목이 존재하지 않습니다.");
				break;
			}
			
			if(emp != null) {
				boolean isSave = saveEmployee(emp);
				if(!isSave) 
					System.out.println("더 이상 저장공간이 없습니다.");
			}
		}
		System.out.print("Program Exit...");
	}
}
