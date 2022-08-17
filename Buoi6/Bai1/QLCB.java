package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {

	public static Scanner sc = new Scanner(System.in);
	public static boolean check = false;
	public static int c;
	static ArrayList<CongNhan> congnhanList = new ArrayList<>();
	static ArrayList<KySu> kysuList = new ArrayList<>();
	static ArrayList<NhanVien> nhanvienList = new ArrayList<>();
	public static int m, n, p;

	public static void main(String[] args) {

		CongNhan[] congnhan = new CongNhan[1000];

		NhanVien[] nhanvien = new NhanVien[1000];

		KySu[] kysu = new KySu[1000];
		int choose;
		do {
			System.out.println("\t\t\tMENU");
			System.out.println("1.Nhap thong tin can bo");
			System.out.println("2.Hien thi danh sach cac can bo");
			System.out.println("3.Xoa can bo theo id");
			System.out.println("4.Tim kiem can bo theo id");
			System.out.println("5.Thoat chuong trinh");
			System.out.print(" Nhap vao lua chon cua ban : ");
			choose = sc.nextInt();
			switch (choose) {
			case 1: {
				input(congnhan,nhanvien,kysu);
				break;

			}
			case 2:{
				output(congnhan,nhanvien,kysu);
				break;
			}case 3:{
				xoaCanBo();
				break;
			}
			case 4:{
				timKiemCanBo();
				break;
			}
			case 5:{
				System.out.println("Cam on da su dung chuong trinh");
				return;
			}
			default:{
				System.out.println("khong co chuc nang nay");
				break;
			}

		} 

		}while(true);
	}

	// Ham nhap:
	public static void input(CongNhan[] congnhan, NhanVien[] nhanvien, KySu[] kysu) {
		do {
			System.out.println("\t\t\tMENU");
			System.out.println("1.Add thong tin cong nhan");
			System.out.println("2.Add thong tin nhan vien");
			System.out.println("3.Add thong tin ky su");
			System.out.println("4.Thoat lenh add");
			System.out.println("Moi nhap lua chon: ");
			c = sc.nextInt();
			switch (c) {
			case 1: {
				do {
					System.out.print(" Nhap vao so cong nhan : ");
					n = sc.nextInt();
					if (n < 0) {
						System.out.println(" Nhap so cong nhan > 0!");
					}
				} while (n < 0);
				for (int i = 0; i < n; i++) {
					congnhan[i] = new CongNhan();
				}
				for (int i = 0; i < n; i++) {
					System.out.println(" Nhap thong tin cong nhan thu : " + (i + 1));
					congnhan[i].input();
					check = true;
				}
				for (int i = 0; i < n; i++) {
					congnhanList.add(congnhan[i]);
				}
				break;
			}
			case 2: {
				do {
					System.out.print(" Nhap vao so nhan vien: ");
					m = sc.nextInt();
					if (m < 0) {
						System.out.println(" Nhap so nhan vien > 0!");
					}
				} while (m < 0);
				for (int i = 0; i < m; i++) {
					nhanvien[i] = new NhanVien();
				}
				for (int i = 0; i < n; i++) {
					System.out.println(" Nhap thong tin nhan vien thu : " + (i + 1));
					nhanvien[i].input();
					check = true;
				}
				for (int i = 0; i < m; i++) {
					nhanvienList.add(nhanvien[i]);
				}
				break;
			}
			case 3: {
				do {
					System.out.print(" Nhap vao so ky su: ");
					p = sc.nextInt();
					if (p < 0) {
						System.out.println(" Nhap so ky su > 0!");
					}
				} while (p < 0);
				for (int i = 0; i < p; i++) {
					kysu[i] = new KySu();
				}
				for (int i = 0; i < n; i++) {
					System.out.println(" Nhap thong tin ky su thu : " + (i + 1));
					kysu[i].input();
					check = true;
				}
				for (int i = 0; i < m; i++) {
					kysuList.add(kysu[i]);
				}
				break;
			}
			case 4: {
				System.out.println("Ket thuc qua trinh add thong tin can bo.");
				return;
			}
			default: {
				System.out.println("khong co chuc nang nay");
				break;
			}
			}
		} while (true);
	}

	// Ham xuat:
	public static void output(CongNhan[] congnhan, NhanVien[] nhanvien, KySu[] kysu) {

		System.out.println("====================THONG TIN TONG HOP========================");
		System.out.println("        ============thong tin cong nhan===============         ");
		System.out.printf("%-10s%-20s%-20s%-20s%-20s%-20s", "id", "ho ten", "nam sinh", "gioi tinh", "dia chi", "bac ");
		for (int i = 0; i < congnhanList.size(); i++) {
			congnhanList.get(i).output();
		}
		System.out.println("\n        ============thong tin nhan vien==============         ");
		System.out.printf("%-10s%-20s%-20s%-20s%-20s%-20s", "id", "ho ten", "nam sinh", "gioi tinh", "dia chi","cong viec");
		for (int i = 0; i < nhanvienList.size(); i++) {
			nhanvienList.get(i).output();
		}
		System.out.println("\n        ============ thong tin ky su   ==============         ");
		System.out.printf("%-10s%-20s%-20s%-20s%-20s%-20s", "id", "ho ten", "nam sinh", "gioi tinh", "dia chi","nganh dao tao");
		for (int i = 0; i < kysuList.size(); i++) {
			kysuList.get(i).output();
		}

	}

	// Ham xoa can bo theo id

	public static void xoaCanBo() {
		
        System.out.print(" Nhap id can bo muon xoa : ");
        int id = sc.nextInt();
        int k=0;
    	for (int i = 0; i < congnhanList.size(); i++) {
            if (id == congnhanList.get(i).getId()) {
                k=1; 
                congnhanList.remove(i);
            }
        }
    	for(int i=0;i<nhanvienList.size();i++) {
    		if(id== nhanvienList.get(i).getId()) {
    			k=2;
    			nhanvienList.remove(i);
    		}
    	}
    	for(int i=0;i<kysuList.size();i++) {
    		if(id==kysuList.get(i).getId()) {
    			k=3;
    			kysuList.remove(i);
    		}
    	}
    	if(k==1) {
    		System.out.println("id ban muon xoa la mot cong nhan");
    		System.out.println("\n===> DANH SACH CONG NHAN SAU KHI XOA CN ID : "+id);
    		System.out.println("        ============thong tin cong nhan===============         ");
    		System.out.printf("%-10s%-20s%-20s%-20s%-20s%-20s", "id", "ho ten", "nam sinh", "gioi tinh", "dia chi", "bac ");
    		for (int i = 0; i < congnhanList.size(); i++) {
    			congnhanList.get(i).output();
    		}
    	}else if(k==2) {
    		System.out.println("id ban muon xoa la mot nhan vien");
    		System.out.println("\n===> DANH SACH NHAN VIEN SAU KHI XOA CN NV : "+id);
    		System.out.println("        ============thong tin nhan vien===============         ");
    		System.out.printf("%-10s%-20s%-20s%-20s%-20s%-20s", "id", "ho ten", "nam sinh", "gioi tinh", "dia chi", "cong viec ");
    		for (int i = 0; i < nhanvienList.size(); i++) {
    			nhanvienList.get(i).output();
    		}
    	}else if(k==3) {
    		System.out.println("id ban muon xoa la mot ky su");
    		System.out.println("\n===> DANH SACH KY SU SAU KHI XOA KS ID : "+id);
    		System.out.println("        ============thong tin ky su===============         ");
    		System.out.printf("%-10s%-20s%-20s%-20s%-20s%-20s", "id", "ho ten", "nam sinh", "gioi tinh", "dia chi", "nganh dao tao");
    		for (int i = 0; i < kysuList.size(); i++) {
    			kysuList.get(i).output();
    		}
    	}else {
    		System.out.println("khong can bo nao co id nay");
    	}
        }
	
	
	
	//HAM TIM KIEM CAN BO THEO ID
	public static void timKiemCanBo() {
		System.out.println("nhap id muon xoa: ");
		int id=sc.nextInt();
	       
	    	for (int i = 0; i < congnhanList.size(); i++) {
	            if (id == congnhanList.get(i).getId()) {
	            	System.out.println("can bo co id can tim la:");
	               congnhanList.get(i).output();
	            }
	        }
	    	for(int i=0;i<nhanvienList.size();i++) {
	    		if(id== nhanvienList.get(i).getId()) {
	    			System.out.println("can bo co id can tim la");
	    			nhanvienList.get(i).output();
	    		}
	    	}
	    	for(int i=0;i<kysuList.size();i++) {
	    		if(id==kysuList.get(i).getId()) {
	    			System.out.println("can bo co id can tim la: ");
	    			kysuList.get(i).output();
	    		}
	    	}
	    	
	    	
	        }
	
		
	}
	
        
   


