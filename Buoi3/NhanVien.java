import java.util.Scanner;

public class NhanVien {
	static Scanner sc = new Scanner(System.in);
	private static int mnv = 0;
	private int tuoi;
	private String ten;
	private String diachi;
	private String bophanlamviec;

	public void input() {
		System.out.println("nhap ten: ");
		ten = sc.nextLine();
		System.out.println("nhap tuoi: ");
		tuoi = sc.nextInt();
		sc.nextLine();
		System.out.println("nhap dia chi: ");
		diachi = sc.nextLine();
		System.out.println("nhap bo phan lam viec: ");
		bophanlamviec = sc.nextLine();
	}

	public void output() {
		mnv++;
		System.out.printf("\n%-10d%-10s%-10d%-10s%-10s", mnv, ten, tuoi, diachi, bophanlamviec);
	}

	public static void main(String[] args) {
		NhanVien a[] = new NhanVien[5];
		for(int i=0;i<a.length;i++) {
			a[i]=new NhanVien();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("nhap thong tin nhan vien thu " + (i+1)+ " : ");
			a[i].input();
		}
		System.out.println("             THONG TIN CAC NHAN VIEN                   ");
		System.out.printf("%-10s%-10s%-10s%-10s%-10s", "Manv", "Tennv", "Tuoi", "DiaChi", "BoPhan");
		for(int i=0;i<a.length;i++) {
			a[i].output();
		}

	}

}
