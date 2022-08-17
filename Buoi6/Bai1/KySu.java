package Bai1;

import java.util.Scanner;

public class KySu extends CanBo {
	static Scanner sc = new Scanner(System.in);
	private String nganhDaoTao;
	private int id;
    private static int tempks=10000;
	public KySu(String hoTen, int namSinh, String gioiTinh, DiaChi diachi, String nganhDaoTao) {
		super(hoTen, namSinh, gioiTinh, diachi);
		this.nganhDaoTao = nganhDaoTao;
	}

	public KySu() {
		id= tempks++;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}

	public void input() {
		super.input();
		System.out.println("nhap nganh dao tao: ");
		nganhDaoTao=sc.nextLine();
	}

	public void output() {
		System.out.printf("\n%-20d",id);
		super.output();
		System.out.printf("%-20s", nganhDaoTao);
	}
}
