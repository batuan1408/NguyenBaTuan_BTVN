import java.util.Scanner;

public class HinhChuNhat {
	public static Scanner sc = new Scanner(System.in);
	private float chieudai;
	private float chieurong;
	public static int temp=1;
	public void input() {
		System.out.println("nhap thong tin hinh chu nhat "+temp);
		System.out.println("nhap chieu dai hinh chu nhat: ");
		chieudai=sc.nextFloat();
		System.out.println("nhap chieu rong hinh chu nhat: ");
		chieurong=sc.nextFloat();
		temp++;
	}
	public void output() {
		System.out.printf("\n%-10d%-20f%-20f%-20f%-20f",temp,chieudai,chieurong,chuvi(),dientich());
		temp++;
		
	}
	public float chuvi() {
		return (chieudai+chieurong)*2;
		
	}
	public float dientich() {
		return chieudai*chieurong;
	}
	
	public float getChieudai() {
		return chieudai;
	}
	public void setChieudai(float chieudai) {
		this.chieudai = chieudai;
	}
	public float getChieurong() {
		return chieurong;
	}
	public void setChieurong(float chieurong) {
		this.chieurong = chieurong;
	}
	public static void main(String[] args) {
		HinhChuNhat a = new HinhChuNhat();
		HinhChuNhat b = new HinhChuNhat();
		//nhap thong tin theo cach 1: 
//		a.input();
//		b.input();
		//nhap thong tin theo cach 2:
		System.out.println("nhap thong tin hinh chu nhat 1: ");
		System.out.println("nhap chieu dai: ");
		a.setChieudai(sc.nextFloat());
		System.out.println("nhap chieu rong: ");
		a.setChieurong(sc.nextFloat());
		System.out.println("nhap thong tin hinh chu nhat 2: ");
		System.out.println("nhap chieu dai: ");
		b.setChieudai(sc.nextFloat());
		System.out.println("nhap chieu rong: ");
		b.setChieurong(sc.nextFloat());
		//xuat thong tin: 
		System.out.printf("%-10s%-20s%-20s%-20s%-20s","stt","chieudai","chieurong","chu vi","dientich");
		a.output();
		b.output();
		//so sanh dien tich: 
		if(a.dientich()>b.dientich()) {
			System.out.println("\ndien tich hinh chu nhat a lon hon dien tich hinh chu nhat b");
		}else if(a.dientich()<b.dientich()){
			System.out.println("\ndien tich hinh chu nhat b lon hon dien tich hinh chu nhat a");
		}else {
			System.out.println("\nhai hinh chu nhat co dien tich bang nhau");
		}
		
		
	}
	

}
