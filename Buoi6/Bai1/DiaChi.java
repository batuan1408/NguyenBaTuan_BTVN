package Bai1;

import java.util.Scanner;

public class DiaChi {
	static Scanner sc = new Scanner(System.in);

	private String district;
	private  String province;

	public void nhap() {

		System.out.println("nhap district: ");
		district = sc.nextLine();
		System.out.println("nhap province: ");
		province = sc.nextLine();
	}

	public void xuat() {
		System.out.printf("%-10s%-10s", district, province);
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}
}
