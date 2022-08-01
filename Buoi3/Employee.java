import java.util.Scanner;
public class Employee {
	static Scanner sc = new Scanner(System.in);
	private String id;
	private String name;
	private int age;
	private int workDays;
	private double salary;
	static final int PRICE = 50;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWorkDays() {
		return workDays;
	}

	public void setWorkDays(int workDays) {
		this.workDays = workDays;
	}
//constructer:
	public Employee(String ids, String names, int ages, int workDayss) {
		id = ids;
		name = names;
		age = ages;
		workDays = workDayss;
	}
	public double getSalary() {
		return workDays*PRICE;
	}
	public void input() {
		System.out.println("nhap id: ");
		id=sc.nextLine();
		System.out.println("nhap ten: ");
		name=sc.nextLine();
		System.out.println("nhap tuoi: ");
		age=sc.nextInt();
		System.out.println("nhap so ngay cong: ");
		workDays=sc.nextInt();
	}
	public void output() {
		System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s","id","ten","tuoi","ngay cong","price","tiencong");
		System.out.printf("\n%-20s%-20s%-20d%-20d%-20d%-20f",id,name,age,workDays,PRICE,getSalary());
	}
	public static void main(String[] args) {
	Employee a = new Employee("123","tuan",18,4);
	a.output();
	//nhap thong tin = input(): 
//	a.input();
	}

}
