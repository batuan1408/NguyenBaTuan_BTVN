package Bai1;

import java.util.Scanner;

public class CanBo {
	static Scanner sc = new Scanner(System.in);
	private int id;
	private String hoTen;
	private int namSinh;
	private String gioiTinh;
	private DiaChi diachi = new DiaChi();
	private int tem = 0;

	public CanBo(String hoTen, int namSinh, String gioiTinh, DiaChi diachi) {

		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
		this.diachi = diachi;
	}
	public CanBo() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public DiaChi getDiachi() {
		return diachi;
	}

	public void setDiachi(DiaChi diachi) {
		this.diachi = diachi;
	}

	public void input() {
		System.out.println("nhap ho ten: ");
		hoTen = sc.nextLine();
		System.out.println("nhap nam sinh(year): ");
		namSinh = sc.nextInt();
		sc.nextLine();
		System.out.println("nhap gioi tinh: ");
		gioiTinh = sc.nextLine();
		diachi.nhap();
	}

	public void output() {
		System.out.printf("%-20s%-20d%-20s", hoTen, namSinh, gioiTinh);
		diachi.xuat();
	}
}
