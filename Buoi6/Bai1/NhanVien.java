package Bai1;

import java.util.Scanner;

public class NhanVien extends CanBo {
	static Scanner sc = new Scanner(System.in);

	private String congViec;
	private int id;
    private static int tempnv=1000;
	public NhanVien(String hoTen,int namSinh, String gioiTinh, DiaChi diachi, String congViec) {
		super(hoTen, namSinh, gioiTinh, diachi);
		this.congViec = congViec;
	}

	public NhanVien() {
		 id=tempnv++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

	public void input() {
		super.input();
		System.out.println("nhap cong viec : ");
		congViec=sc.nextLine();

	}

	public void output() {
		System.out.printf("\n%-10d",id);
		super.output();
		System.out.printf("%-20s", congViec);
	}

}
