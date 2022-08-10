import java.util.Scanner;

public class QuanLy {
	static Scanner sc = new Scanner(System.in);

	private static int maQL;
	private String hoTen;

	
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public void nhap() {
		System.out.println("nhap ma qua ly: ");
		maQL=sc.nextInt();
		System.out.println("nhap ten quan ly: ");
		hoTen = sc.nextLine();

	}
	public void xuat() {
		System.out.println("ma quan ly: "+maQL);
		System.out.println("ho ten quan ly: "+hoTen);
	}
}
