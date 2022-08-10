import java.util.Scanner;

public class May {
	static Scanner sc = new Scanner(System.in);

	private int maMay;
	private String kieuMay;
	private String tinhTrang;

	

	public void nhap() {
		System.out.println("nhap ma may: ");
		maMay=sc.nextInt();
		System.out.println("nhap kieu may: ");
		kieuMay=sc.nextLine();
		System.out.println("nhap tinh trang may: ");
		tinhTrang= sc.nextLine();
	}
	public void xuat() {
		System.out.println("ma may: "+maMay);
		System.out.println("kieu may: "+kieuMay);
		System.out.println("tinh trang may: "+tinhTrang);
		
	}
}
