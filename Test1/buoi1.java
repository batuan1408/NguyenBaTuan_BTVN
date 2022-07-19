import java.util.Scanner;

public class buoi1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*int a;
		int tongSo;
		// hang o thi viet hoa tat ca cac tu
		// vidu: HANG_SO
		// cac khieu du lieu:
		// byte, short, int, long, ..., char, float, double,...,boolean

		// nhap xuat:
		
//		System.out.print(" nhap a: ");
//		a= sc.nextInt();
//		System.out.print("gia tri a: "+ a+ "\n");
//		System.out.println("gia tri a: "+ a);
//		System.out.printf("gia tri a: %d\n",a);
//		long b = sc.nextLong();
//		byte c = sc.nextByte();
//		float d = sc.nextFloat();
		//ep kieu: 
		byte e= 2;
		short b = 3;
		int c= 5;
		long d = 6L;
		int sum = e+b+c+(int)d;
		float f=3.14f;
		System.out.println("gia tri f= "+f);
		double g = 5.3d;
		int m = (int )f;
		System.out.println("gia tri m= "+m);*/
		//cau lenh dieu kien: 
		//if else: 
//		int a = sc.nextInt();
//		if(a>0) {
//			System.out.println("a la so duong");
//		}else if(a<0) {
//			System.out.println("a la so am");
//		}else {
//			System.out.println("a la so 0");
//		}
//		System.out.print("nhap diem 1 tiet: ");
//		float diem1tiet = sc.nextInt();
//		System.out.print("nhap diem giua ky: ");
//		float diemGiuaky = sc.nextInt();
//		System.out.print("nhap diem cuoi ky: ");
//		float diemCuoiky = sc.nextInt();
//		float diemTb = (diem1tiet+diemGiuaky+diemCuoiky)/3;
//		
//		if(diemTb>=9) {
//			System.out.println("xep hang A");
//		}else if(diemTb>=7) {
//			System.out.println("xep hang B");
//		}else if(diemTb>=5) {
//			System.out.println("xep hang C");
//		}else  {
//			System.out.println("xep hang F");
//		}
		//switch case: 
//		int a = sc.nextInt();
//		switch(a) {
//		case 1 : {
//			System.out.println("gia tri b = 1 ");
//		}
//		case 2 : {
//			System.out.println("gia tri cua b = 2");
//		}
//		default : {
//			
//		}
//		}
		//vong lap: for, while, do while;
		//for(int i=0;i<n;i++){
		//....
		//}
		
		
		//while(dieukien){
		//...
		//}
		
		//do{
		//...
		//}while(dieukien);
		
		int thang;
		int nam;
		System.out.println("nhap nam: ");
		nam = sc.nextInt();
		System.out.println("nhap thang: ");
		thang = sc.nextInt();
		switch(thang) {
		case 1: case 3: case 5: case 7:case 8:case 10: case 12:{
			System.out.println("thang "+thang+" co 31 ngay.");
			break;
		}
		case 2:{
			if((nam%4==0&&nam%100!=0)||nam%400==0) {
				System.out.println("thang " +thang+ " co 29 ngay.");
			}else {
				System.out.println("thang "+thang+" co 28 ngay.");
			}
			break;
		}
		case 4: case 6: case 9: case 11:{
			System.out.println("thang " +thang+ " co 30 ngay. ");
			break;
		}
		default: 
			System.out.println("nhap khong dung so thang!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
