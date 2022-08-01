import java.util.Scanner;

public class PtBac2 {
	static Scanner sc = new Scanner(System.in);
	private float a;
	private float b;
	private float c;

	public void input() {
		System.out.println("nhap he so a: ");
		a=sc.nextFloat();
		System.out.println("nhap he so b: ");
		b=sc.nextFloat();
		System.out.println("nhap he so c: ");
		c=sc.nextFloat();

	}
	public void output() {
		if(a==0) {
			if(b==0) {
				if(c==0) {
					System.out.println("phuong trinh co vo so nghiem");
				}else {
					System.out.println("phuong trinh vo nghiem");
				}
			}else {
				System.out.println("phuong trinh co nghiem la: "+(-c)/b);
			}
		}else {
			float denta = b*b-4*a*c;
			if(denta<0) {
				System.out.println("phuong trinh vo nghiem");
			}else if(denta==0){
				System.out.println("phuong trinh co nghiem kep la: "+ (-b)/(2*a));
				
			}else {
				System.out.println("phuong trinh co 2 nghiem phan biet la: x1= "+ (-b+Math.sqrt(denta))/(2*a)+" \nva x2= "+(-b-Math.sqrt(denta))/(2*a) );
			}
		}
	}
	public static void main(String[] args) {
		PtBac2 a = new PtBac2();
		a.input();
		a.output();
		
	}
}
