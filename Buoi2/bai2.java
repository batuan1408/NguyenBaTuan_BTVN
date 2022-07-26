import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a;
		System.out.println("nhap chuoi: ");
		a=sc.nextLine();
		a = a.trim();
	    while(a.indexOf("  ")!=-1) {
	    	a=a.replaceAll("  "," ");
	    }
	    
		// Phương thức indexOf() trả về vị trí xuất hiện đầu tiên của một String trong String khác, nếu không tìm thấy thì trả về -1;
	    //Phương thức replaceAll(str1,str2) dùng để thay thế các chuỗi/ký tự str1 được tìm thấy thành chuỗi/ký tự str2. 
		String []b=a.split(" ");
		a = "";
		for(int i=0;i<b.length;i++) {
			a+=b[i].substring(0,1).toUpperCase()+b[i].substring(1).toLowerCase()+" ";
			
			
		}
		
			a=a.replaceAll("[0-9]","");
			System.out.println(a);
		}
		
	}

	

	

