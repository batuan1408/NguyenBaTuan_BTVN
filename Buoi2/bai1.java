import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("nhap n: ");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("nhap mang: ");
		for (int i = 0; i < n; i++) {
			System.out.print("nhap a[" + i + "]: ");
			a[i] = sc.nextInt();
		}
		int sum = 0;
		int dem = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 != 0 && i % 2 == 0) {
				sum += a[i];
				dem++;
			}
		}
		if (dem == 0) {
			System.out.println("trong mang khong co so le o vi tri chan!");
		} else {
			System.out.println("trung binh cong cac so le o vi tri chan trong mang la: " + ((float) sum / dem));
		}
		int min = a[0];
		for (int i = 1; i < n; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.print("vi tri cac so nho nhat: ");
		for (int i = 0; i < n; i++) {
			if (a[i] == min) {
				System.out.print((i+1) + " ");
			}
		}
		dem = 0;
		for (int i = 0; i < n; i++) {
			if (checkCP(a[i])) {
				dem++;
			}
		}
		System.out.println("\n");
		if (dem == 0) {
			System.out.println("mang khum co so chinh phuong!");
		} else {
			System.out.print("cac so chinh phuong trong mang la: ");
			for (int i = 0; i < n; i++) {
				if (checkCP(a[i])) {
					System.out.print(a[i] + " ");
				}
			}
		}
		dem = 0;
		for (int i = 0; i < n; i++) {
			if (checkNT(a[i])) {
				dem++;
			}
		}
		System.out.println("\n");
		if (dem == 0) {
			System.out.println("mang khong co so nguyen to!");
		} else {
			System.out.print("cac so nguyen to trong mang la: ");
			for (int i = 0; i < n; i++) {
				if (checkNT(a[i])) {
					System.out.print(a[i] + " ");
				}
			}
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		System.out.println("\nmang sau khi sap xep la: ");
		for (int i : a) {
			System.out.print(i+" ");
		}

	}

	public static boolean checkCP(int a) {
		if (a == 1) {
			return false;
		}
		for (int i = 2; i < a; i++) {
			if (a == i * i) {
				return true;
			}
		}
		return false;
	}

	public static boolean checkNT(int a) {
		if (a == 1) {
			return false;
		}
		int dem = 0;
		for (int i = 2; i * i <= a; i++) {
			if (a % i == 0) {
				dem++;
			}
		}
		if (dem == 0) {
			return true;
		} else {
			return false;
		}
	}
}
