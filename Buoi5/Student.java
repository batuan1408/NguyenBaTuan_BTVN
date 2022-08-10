import java.util.Scanner;

public class Student {
	static Scanner sc = new Scanner(System.in);
	protected int id;
	private String name;
	private int age;
	protected Address address = new Address();

	public void nhap() {
     	System.out.println("nhap id sinh vien: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("nhap ten sinh vien: ");
		name = sc.nextLine();
		System.out.println("nhap tuoi sinh vien: ");
		age = sc.nextInt();
		System.out.println("nhap dia chi sinh vien: ");
		address.nhap();
		while(this.id==address.id) {
			System.out.println("trung id");
			System.out.println("nhap lai id sinh vien: ");
			id=sc.nextInt();
		}
	}

	public void xuat() {
		System.out.printf("\n%-10d%-20s%-10d", id, name, age);
		address.xuat();
	}
	
    
	public static void main(String[] args) {
		int n;
		System.out.println("nhap so luong sinh vien: ");
		n=sc.nextInt();
		Student a[]=new Student[n];
		for(int i=0;i<n;i++) {
			a[i]=new Student();
		}
		System.out.println("nhap thong tin sinh vien: ");
		for(int i=0;i<n;i++) {
			System.out.println("nhap thong tin sinh vien thu "+(i+1)+": ");
			a[i].nhap();
		}
		System.out.println("===================THONG TIN SINH VIEN======================");
		System.out.printf("%-10s%-20s%-10s%-20s", "id", "ho ten", "tuoi", "dia chi");
		for(int i=0;i<n;i++) {
			a[i].xuat();
		}
		int find;
		System.out.println("\nnhap id sinh vien muon tim kiem: ");
		find = sc.nextInt();
		for(int i=0;i<n;i++) {
			if(a[i].id==find) {
				System.out.println("sinh vien can tim la: ");
				System.out.printf("%-10s%-20s%-10s%-20s", "id", "ho ten", "tuoi", "dia chi");
				a[i].xuat();
			}
		}
		for(int i=0;i<n;i++) {
			if(a[i].address.province=="Thanh Hoa") {
				a[i].address.province="Hai Phong";
				
			}
		}
		System.out.println("\nthong tin sinh vien sau khi sua dia chi : ");
		System.out.println("===================THONG TIN SINH VIEN======================");
		System.out.printf("%-10s%-20s%-10s%-20s", "id", "ho ten", "tuoi", "dia chi");
		for(int i=0;i<n;i++) {
			a[i].xuat();
		}
	    int delete;
	    System.out.println("\nnhap id sinh vien muon xoa: ");
	    delete=sc.nextInt();
	   Student b[]=new Student[n-1];
	   int j=0;
	    for(int i=0;i<n;i++) {
	    	if(a[i].id==delete) {
	    		 for( j=0;j<i;j++) {
	    			 b[j]=a[j];
	    			 }
	    		 for( j=i+1;j<n;j++) {
	    			 b[j-1]=a[j];
	    		 }
	    	}
	    }
	    System.out.println("\nthong tin sinh vien sau khi xoa: ");
		System.out.println("===================THONG TIN SINH VIEN======================");
		System.out.printf("%-10s%-20s%-10s%-20s", "id", "ho ten", "tuoi", "dia chi");
		for(int i=0;i<n-1;i++) {
			b[i].xuat();
		}
		
		
	}
	public static Student[] delete(Student[] a,int pos) {
		Student[] newa = new Student[a.length-1];
		for(int i=0;i<pos;i++) {
			newa[i]=a[i];
		}
		for(int i = pos+1;i<a.length;i++) {
			newa[i-1]=a[i];
		}
		return newa;
	}
	
	
	
	
	
		
	}