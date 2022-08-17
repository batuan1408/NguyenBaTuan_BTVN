package Bai2;

import java.util.Scanner;

public class PhuongTien {
	static Scanner sc = new Scanner(System.in);
	private String tenChuXe;
	private String loaiXe;
	private int dungTich;
	private double triGia;
	private double thue;

	public String getTenChuXe() {
		return tenChuXe;
	}

	public void setTenChuXe(String tenChuXe) {
		this.tenChuXe = tenChuXe;
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	public int getDungTich() {
		return dungTich;
	}

	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}

	public double getTriGia() {
		return triGia;
	}

	public void setTriGia(double triGia) {
		this.triGia = triGia;
	}

	public PhuongTien(String tenChuXe, String loaiXe, int dungTich, float triGia) {

		this.tenChuXe = tenChuXe;
		this.loaiXe = loaiXe;
		this.dungTich = dungTich;
		this.triGia = triGia;
	}

	public PhuongTien() {

	}

	public void input() {
		System.out.println("nhap ten chu xe: ");
		tenChuXe = sc.nextLine();
		System.out.println("nhap loai xe: ");
		loaiXe = sc.nextLine();
		System.out.println("nhap dung tich: ");
		dungTich = sc.nextInt();
		System.out.println("nhap tri gia: ");
		triGia = sc.nextDouble();
		sc.nextLine();

	}
    public double getThue() {
    	if(dungTich<100) {
    		thue=triGia*0.02;
    	}else if(dungTich>=100&&dungTich<=200) {
    		thue=triGia*0.06;
    	}else {
    		thue=triGia*0.1;
    	}
    	return thue;
    }

	

	public void output() {
		System.out.printf("\n%-20s%-20s%-20d%-20.2f%.2f", tenChuXe, loaiXe, dungTich, triGia,getThue());

	}

}
