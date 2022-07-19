import java.util.Scanner;
public class bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.print("nhap canh a = ");
		a = sc.nextInt();
		System.out.print("nhap canh b = ");
		b = sc.nextInt();
		System.out.print("nhap canh c = ");
		c = sc.nextInt();
		if((a+b>c)&&(a+c>b)&&(b+c>a)) {
			if((a==b)||(a==c)||(b==c)) {
				System.out.println("TAM GIAC CAN");
			}else if((a==b)&&(a==c)&&(b==c)) {
				System.out.println("TAM GIAC DEU");
				
			}else if((a*a+b*b==c*c)||(a*a+c*c==b*b)||(b*b+c*c==a*a)) {
				System.out.println("TAM GIAC VUONG");
			}else if(((a*a+b*b==c*c)||(a*a+c*c==b*b)||(b*b+c*c==a*a))&&((a==b)||(a==c)||(b==c))) {
				System.out.println("TAM GIAC VUONG CAN");
			}else {
				System.out.println("TAM GIAC THUONG");
			}
		}else if(a<0||b<0||c<0) {
			System.out.println("khong phai 3 canh cua 1 tam giac");
		}else {
			System.out.println("khong phai 3 canh cua 1 tam giac");
		}
		
		
		
		

	}
}
