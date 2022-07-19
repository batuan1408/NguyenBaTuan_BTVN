import java.util.Scanner;
public class bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("nhap n: ");
		n = sc.nextInt();
		int sum= 0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		System.out.print("tong cac uoc cua n = "+sum);
		
		
		

	}
}
