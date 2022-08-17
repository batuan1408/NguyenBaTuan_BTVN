package Bai1;

import java.util.Scanner;

public class CongNhan extends CanBo {
	static Scanner sc = new Scanner(System.in);
	private int bac;
    private static int tempcn=1;
	private int id;

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}

	public CongNhan(String hoTen, int namSinh, String gioiTinh, DiaChi diachi, int bac) {
		super(hoTen, namSinh, gioiTinh, diachi);
		this.bac = bac;
	}

	public CongNhan() {
		id=tempcn++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void input() {
		super.input();
		System.out.println("nhap bac cua cong nhan(tu 1 den 7): ");
		bac = sc.nextInt();
	}
	public void output() {
		System.out.printf("\n%-10d",id);
		super.output();
		System.out.printf("%d/7\n",bac);
	}
	
}
