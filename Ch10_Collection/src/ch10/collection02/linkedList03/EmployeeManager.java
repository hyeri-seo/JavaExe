package ch10.collection02.linkedList03;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
	// Employee의 자식객체들을 저장
	List<Employee> empList = new LinkedList<>();
	private int numOfEmp = 0;	// 저장된 사원객체 수, 다음 사원이 저장될 index
	private Scanner sc = new Scanner(System.in);
	
	private int viewMenu() {
		System.out.println("[ 사원 선택 ]");
		System.out.println("1. 정규직");
		System.out.println("2. 임시직");
		System.out.println("3. 일용직");
		System.out.println("4. 전체정보보기");
		System.out.println("5. 정규직 보기");
		System.out.println("6. 임시직 보기");
		System.out.println("7. 일용직 보기");
		System.out.println("8. 사번으로 사원 정보 검색");
		System.out.println("9. 사번으로 사원 정보 수정");
		System.out.println("10. 사번으로 사원 정보 삭제");
		System.out.println("11. 종료");
		System.out.print("번호 입력 >> ");
		int sel = sc.nextInt();
		return sel;
	}
	private RegularEmployee createRegularEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("연봉 >> ");
		int yearSalary = sc.nextInt();
		System.out.print("보너스 >> ");
		int bonus = sc.nextInt();
		RegularEmployee emp = 
				new RegularEmployee(empno, name, yearSalary, bonus);
		return emp;
	}
	private TempEmployee createTempEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("연봉 >> ");
		int yearSalary = sc.nextInt();
		System.out.print("계약기간 >> ");
		int hireYear = sc.nextInt();
		TempEmployee emp = 
				new TempEmployee(empno, name, yearSalary, hireYear);
		return emp;
	}
	private PartTimeEmployee createPartTimeEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("일당 >> ");
		int dailyPay = sc.nextInt();
		System.out.print("일한 일수 >> ");
		int workDay = sc.nextInt();
		PartTimeEmployee emp = 
				new PartTimeEmployee(empno, name, dailyPay, workDay);
		return emp;
	}
	private boolean saveEmployee(Employee emp) {
		boolean isSave = true;
		
		if(numOfEmp <= 100) {
			this.empList.add(emp);
			this.numOfEmp++;
			isSave = true;
		}else {
			isSave = false;
		}
		
		return isSave;
	}
	private void viewAllEmployeeInfo() {
		for(Employee emp : empList) {
			emp.showEmployeeInfo();
		}
	}
	private void viewRegEmployeeInfo() {
		for(Employee emp : empList) {			
			if(emp instanceof RegularEmployee)
				emp.showEmployeeInfo();
		}
	}
	private void viewTempEmployeeInfo() {
		for(Employee emp : empList) {			
			if(emp instanceof TempEmployee)
				emp.showEmployeeInfo();
		}
	}
	private void viewPartTimeEmployeeInfo() {
		for(Employee emp : empList) {			
			if(emp instanceof PartTimeEmployee)
				emp.showEmployeeInfo();
		}
	}
	private void viewEmployeeInfoByEmpno() {
		System.out.print("정보를 조회할 사원 번호 입력 >> ");
		String empno = sc.next();
		for(Employee emp : empList) {
			if(emp.empno.equals(empno))
				emp.showEmployeeInfo();
		}
	}
	private Employee modifyEmployeeInfoByEmpno() {
		System.out.print("정보를 수정할 사원의 사원 번호 입력 >> ");
		String empno = sc.next();
		Employee newEmp = null;
		Iterator<Employee> iterator = empList.iterator();
		
		while(iterator.hasNext()) {
			Employee emp = iterator.next();					
			if(emp.empno.equals(empno)) {
				emp.showEmployeeInfo();
				System.out.println("--------------------");
				System.out.print("변경할 사원 번호 입력 >> ");
				String newEmpno = sc.next();
				System.out.print("변경할 사원 이름 입력 >> ");
				String newName = sc.next();
				
				if(emp instanceof RegularEmployee) {
					System.out.print("변경할 연봉 입력 >> ");
					int newYearSalary = sc.nextInt();
					System.out.print("변경할 보너스 입력 >> ");
					int newBonus = sc.nextInt();
					newEmp = new RegularEmployee(newEmpno, newName, newYearSalary, newBonus);
				} else if(emp instanceof TempEmployee) {
					System.out.print("변경할 연봉 입력 >> ");
					int newYearSalary = sc.nextInt();
					System.out.print("변경할 게약 기간 입력 >> ");
					int newHireYear = sc.nextInt();
					newEmp = new TempEmployee(newEmpno, newName, newYearSalary, newHireYear);
				} else {
					System.out.print("변경할 연봉 입력 >> ");
					int newDailyPay = sc.nextInt();
					System.out.print("변경할 게약 기간 입력 >> ");
					int newWorkDay = sc.nextInt();
					newEmp = new PartTimeEmployee(newEmpno, newName, newDailyPay, newWorkDay);
				}
				iterator.remove();
				empList.add(newEmp);
				break;
			}
		}
		return newEmp;
	}
	private void removeEmployeeInfoByEmpno() {
		System.out.print("정보를 삭제할 사원 번호 입력 >> ");
	    String empno = sc.next();
	    Iterator<Employee> iterator = empList.iterator(); // Iterator를 사용하여 리스트를 순회

	    while (iterator.hasNext()) {
	        Employee emp = iterator.next();
	        if (emp.empno.equals(empno)) {
	            System.out.println("아래는 삭제될 사원의 정보입니다.");
	            emp.showEmployeeInfo();
	            iterator.remove(); // 현재 요소를 삭제
	            break; // 삭제가 완료되었으므로 반복 종료
	        }
	    }
	}
	public void run() {
		boolean isRun = true;
		while(isRun) {
			int selNum = viewMenu();
			Employee emp = null;
			
			switch(selNum) {
			case EmpMenu.REG_EMP:
				emp = createRegularEmployee();
				break;
			case EmpMenu.TEMP_EMP:
				emp = createTempEmployee();
				break;
			case EmpMenu.PART_EMP:
				emp = createPartTimeEmployee();
				break;
			case EmpMenu.ALL_INFO:
				emp = null;
				viewAllEmployeeInfo();
				break;
			case EmpMenu.REG_INFO:
				viewRegEmployeeInfo();
				break;
			case EmpMenu.TEMP_INFO:
				viewTempEmployeeInfo();
				break;
			case EmpMenu.PART_INFO:
				viewPartTimeEmployeeInfo();
				break;
			case EmpMenu.SEARCH_EMP_BY_EMPNO:
				viewEmployeeInfoByEmpno();
				break;
			case EmpMenu.MODIFY_EMP_BY_EMPNO:
				modifyEmployeeInfoByEmpno();
				break;
			case EmpMenu.REMOVE_EMP_BY_EMPNO:
				removeEmployeeInfoByEmpno();
				break;
			case EmpMenu.EXIT:
				emp = null;
				isRun = false;
				break;
			default:
				emp = null;
				System.out.println("해당 항목이 존재하지 않습니다.");
				break;
			}
			
			// emp객체가 존재한다면
			if(emp != null) {
				boolean isSave = saveEmployee(emp);
				if(!isSave)
					System.out.println("더 이상 저장 공간이 없습니다.");
			}
		}
		System.out.println("Program Exit...");
	}
}
