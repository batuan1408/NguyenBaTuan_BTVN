import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);int n;int t;
		do {
			System.out.println("nhap ngay sinh: ");
		 n = sc.nextInt();
		}while(n<1||n>31);
		do {
			System.out.println("nhap thang sinh: ");
		 t= sc.nextInt();
		}while(t<1||t>12);
		
		switch(t) {
		case 1:{
			if(n>=1&&n<=19) {
				System.out.println("Cung Ma Ket!");
			}else {
				System.out.println("Cung Bao Binh!");
			}
			break;
		}
		case 2:{
			if(n>=1&&n<=18) {
				System.out.println("Cung Bao Binh!");
			}else {
				System.out.println("Cung Song Ngu!");
			}
			break;
		}
		case 3:{
			if(n>=1&&n<=20) {
				System.out.println("Cung Song Ngu!");
			}else {
				System.out.println("Cung Bach Duong!");
			}
			break;
		}
		case 4:{
			if(n>=1&&n<=20) {
				System.out.println("Cung Bach Duong!");
			}else {
				System.out.println("Cung Kim Nguu!");
			}
			break;
		}
		case 5:{
			if(n>=1&&n<=20) {
				System.out.println("Cung Kim Nguu!");
			}else {
				System.out.println("Cung Song Tu!");
			}
			break;
		}
		case 6:{
			if(n>=1&&n<=21) {
				System.out.println("Cung Song Tu!");
			}else {
				System.out.println("Cung Cu Giai!");
			}
			break;
		}
		case 7:{
			if(n>=1&&n<=22) {
				System.out.println("Cung Cu Giai!");
			}else {
				System.out.println("Cung Su Tu !");
			}
			break;
		}
		case 8:{
			if(n>=1&&n<=22) {
				System.out.println("Cung Su Tu!");
			}else {
				System.out.println("Cung Xu Nu!");
			}
			break;
		}
		case 9:{
			if(n>=1&&n<=22) {
				System.out.println("Cung Xu Nu!");
			}else {
				System.out.println("Cung Thien Binh!");
			}
			break;
		}
		case 10:{
			if(n>=1&&n<=23) {
				System.out.println("Cung Thien Binh!");
			}else {
				System.out.println("Cung Bo Cap!");
			}
			break;
		}
		case 11:{
			if(n>=1&&n<=22) {
				System.out.println("Cung Bo Cap!");
			}else {
				System.out.println("Cung Nhan Ma!");
			}
			break;
		}
		case 12:{
			if(n>=1&&n<=21) {
				System.out.println("Cung Nhan Ma!");
			}else {
				System.out.println("Cung Ma Ket!");
			}
			break;
		}
		}
		
		

	}
}
