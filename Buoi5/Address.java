import java.util.Scanner;

public class Address {
	static Scanner sc = new Scanner(System.in);

	protected int id;
	private String district;
	protected String province;

	public void nhap() {
		System.out.println("nhap id dia chi: ");
        id= sc.nextInt();
        sc.nextLine();
        System.out.println("nhap quan: ");
        district= sc.nextLine();
        System.out.println("nhap tinh: ");
        province=sc.nextLine();
	}
	public void xuat() {
		System.out.printf("id: %d,quan: %s,tinh: %s",id,district,province);
	}
}
