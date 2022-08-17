package Bai2;

import java.util.Scanner;

public class RunMain {
	public static Scanner sc = new Scanner(System.in);
	public static boolean check = false;
	public static int n;
    public static float thue;
	public static void main(String[] args) {
		PhuongTien[] pt = new PhuongTien[100];

		int choose;
		do {
			System.out.println("\n");
			System.out.println("\t\t\tMENU");
			System.out.println("1.Nhap thong tin va tao danh sach cac xe");
			System.out.println("2.Xuat ban ke khai tien thue truoc ba cua cac xe");
			System.out.println("3.Xuat ban ke khai tien thue truoc ba cua cac xe voi tien thue giam dan");
			System.out.println("4.Xuat ban ke khai tien thue truoc ba cua cac xe voi tien thue tang dan");
			System.out.println("5.Thoat");
			System.out.print("Moi nhap lua chon cua ban: ");
			choose = sc.nextInt();
			switch (choose) {
			case 1: {
				input(pt);
				break;
			}
			case 2: {
				output(pt);
				break;
			}
			case 3: {
				sapXepGiamDan(pt);
				break;
			}
			case 4: {
				sapXepTangDan(pt);
				break;
			}
			case 5: {
				System.out.println("Cam on da su dung chuong trinh");
				return;
			}
			default: {
				System.out.println("Khong co chuc nang nay");
			}
			}
		} while (true);

	}

	// HAM NHAP:
	public static void input(PhuongTien[] pt) {
		do {
			System.out.println("nhap so luong phuong tien can dang ky xe: ");
			n = sc.nextInt();
			if (n <= 0) {
				System.out.println("Nhap so luong phong tien > 0");
			}
		} while (n <= 0);
		for (int i = 0; i < n; i++) {
			pt[i] = new PhuongTien();
		}
		for (int i = 0; i < n; i++) {
			System.out.println("nhap thong tin phuong tien thu " + (i + 1) + ": ");
			pt[i].input();
			check = true;
		}
	}

	// HAM XUAT:
	public static void output(PhuongTien[] pt) {
		if (checkMang()) {
			System.out.println("\t\t\tTHONG TIN PHUONG TIEN");
			System.out.printf("%-20s%-20s%-20s%-20s%-20s", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia","Thue phai nop");
			for (int i = 0; i < n; i++) {
				pt[i].output();
				
				
			}
		} else {
			System.out.println("Chua co phuong tien nao trong danh sach");
		}
	}

	// HAM XAP XEP GIAM DAN
	public static void sapXepGiamDan(PhuongTien[] pt) {
		PhuongTien temp = new PhuongTien();
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (pt[i].getThue() < pt[j].getThue()) {
					temp = pt[i];
					pt[i] = pt[j];
					pt[j] = temp;
				}
			}
		}
		output(pt);
	}

	// HAM XAP XEP TANG DAN
	public static void sapXepTangDan(PhuongTien[] pt) {
		PhuongTien temp = new PhuongTien();
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (pt[i].getThue() > pt[j].getThue()) {
					temp = pt[i];
					pt[i] = pt[j];
					pt[j] = temp;
				}
			}
		}
		output(pt);
	}

	// HAM CHECK MANG:
	public static boolean checkMang() {
		return check;
	}
	
	

}
