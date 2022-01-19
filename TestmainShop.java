package quanlishopgiay;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TestmainShop {
	 static ArrayList<SanPham> glist=new ArrayList<SanPham>();
     static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		int chon;
		do {
			menu();
			chon=Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1:
				ThemGiay();
				break;
			case 2:
				SapXepbyGia();
				break;
			case 3:
				SapXepbyTen();
				break;
			case 4:
				SuabyTen();
				break;
			case 5:
				XoabyTen();
				break;
			case 6 :
				Hienthi();
				break;
			case 7:
				LuuFile();
				break;
			case 8:
				System.out.println("Kết thúc chương trinh. ");
			default:
				System.out.println("Kiểm tra và nhập lại!!! ");
				break;
			}
			
		}while(chon !=8);
	}
	private static void LuuFile() {
		// lưu file
 	   FileOutputStream fos =null;
 	   try {
 		   fos=new FileOutputStream("Giay.txt",true);
 		   for(SanPham gbd:glist) {
 			   String line= gbd.GetFileline();
 			   try {
  					byte[] b=line.getBytes("utf8");
  					try {
  						fos.write(b);
  					} catch (IOException e) {
  						// TODO Auto-generated catch block
  						e.printStackTrace();
  					}
  				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
  					e.printStackTrace();
  				}
  				
  			}
  		} catch (FileNotFoundException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}finally {
  			if(fos!=null) {
  				try {
  					fos.close();
  				} catch (IOException e) {
  					// TODO Auto-generated catch block
  					e.printStackTrace();
			  }
	  }
}
 		   
		
	}
	private static void Hienthi() {
		// Hiển thị.
				for(SanPham gbd:glist) {
					gbd.Xuat();
				}
		
	}
	private static void XoabyTen() {
		System.out.println("Xóa giày theo tên giày");
	     String name= sc.nextLine();
			for(SanPham gbd:glist) {
				if(gbd.getTensp().equals(name)) {
					glist.remove(gbd);
					break;
				}
			}
		
	}
	private static void SuabyTen() {
		System.out.println("Sửa theo tên giày:");
		int n=Integer.parseInt(sc.nextLine());
		for(SanPham g:glist) {
			if(g.getTensp().equals(g)) {
				g.Nhap();
				break;
			}
		}
		
	}
	private static void SapXepbyTen() {
		//tu A->Z
				Collections.sort(glist,new Comparator<SanPham>() {

					@Override
					public int compare(SanPham o1, SanPham o2) {
						// TODO Auto-generated method stub
						return o1.getTensp().compareToIgnoreCase(o2.getTensp());
					}		
		
	});
				}
	private static void SapXepbyGia() {
		// Từ cao đến thấp.
				Collections.sort(glist,new Comparator<SanPham>() {

					@Override
					public int compare(SanPham o1, SanPham o2) {
				        if(o1.getGiasp()>o2.getGiasp()){
				        	return -1;
				        }
						return 1;}	
	});
				}
	
	private static void ThemGiay() {
		// thêm.
				System.out.println("Số thông tin giày cần thêm: ");
				
				int n=Integer.parseInt(sc.nextLine());
				for(int i=0;i<n;i++) {
					SanPham gbd= new SanPham() {
						
					};
					gbd.Nhap();;
					glist.add(gbd);
				}
	}
	         static void menu() {
 	   System.out.println("=====>Menu=====>");
 	   System.out.println("1.Thêm giày: ");
 	   System.out.println("2. Sắp xếp giày theo giá: ");
 	   System.out.println("3.Sắp xếp giày theo tên giày:");
 	   System.out.println("4.Sửa theo tên giày: ");
 	   System.out.println("5.Xóa theo theo tên giày: ");
 	   System.out.println("6.Hiển thị: ");
 	   System.out.println("7.Lưu File Giay.txt ");
 	   System.out.println("8.Kết thúc chương trình: ");
    }
}



