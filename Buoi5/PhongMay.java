import java.util.Scanner;

public class PhongMay {
	static Scanner sc = new Scanner(System.in);

	private int maPhong;
	private String tenPhong;
	private float dienTich;
	private QuanLy x = new QuanLy();
	private May y = new May();
    
	public void nhap() {
		System.out.println("nhao ma phong: ");
		maPhong=sc.nextInt();
		System.out.println("nhap ten phong may: ");
		tenPhong = sc.nextLine();
		System.out.println("nhap dien tich phong : ");
        dienTich=sc.nextFloat();
        x.nhap();
        y.nhap();
	}
	public void xuat() {
		System.out.println("ma phong: "+ maPhong);
		System.out.println("ten phong may: "+tenPhong);
		System.out.println("dien tich phong may: "+dienTich+" met vuong");
		x.xuat();
		y.xuat();
	}
	public static void main(String[] args) {
		PhongMay a = new PhongMay();
		a.nhap();
		System.out.println("            THONG TIN PHONG MAY           ");
		a.xuat();
		
	}
}
