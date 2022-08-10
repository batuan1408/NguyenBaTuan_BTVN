import java.util.Scanner;
public class checkNT {
	static Scanner sc = new Scanner(System.in);
	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		int sum = 0;
		for (int i = 2; i * i < n; i++) {
			if (n % i == 0) {
				sum++;
			}
		}
		if (sum == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPrime(long n) {
		if (n < 2) {
			return false;
		}
		int sum = 0;
		for (int i = 2; i * i < n; i++) {
			if (n % i == 0) {
				sum++;
			}
		}
		if (sum == 0) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean isPrime(float n) {
		return false;
	}
	public static boolean isPrime(double n) {
		return false;
	}
	public static void main(String[] args) {
		int a;
		long b;
		float c;
		double d;
		
		System.out.println("nhap so nguyen kieu int:  ");
		a=sc.nextInt();
		System.out.println("nhap so nguyen kieu long: ");
		b=sc.nextLong();
		System.out.println("nhap so thuc kieu float: ");
		c=sc.nextFloat();
		System.out.println("nhap so thuc kieu double: ");
		d=sc.nextDouble();
		if(isPrime(a)) {
			System.out.println(a+" la so nguyen to");
		}else {
			System.out.println(a+" khong la so nguyen to");
		}
		if(isPrime(b)) {
			System.out.println(b+" la so nguyen to");
		}else {
			System.out.println(b+" khong la so nguyen to");
		}
		if(isPrime(c)) {
			System.out.println(c+" la so nguyen to");
		}else {
			System.out.println(c+" khong la so nguyen to");
		}
		if(isPrime(d)) {
			System.out.println(d+" la so nguyen to");
		}else {
			System.out.println(d+" khong la so nguyen to");
		}
		
			
			
			
			
			
			
			
	}
}
