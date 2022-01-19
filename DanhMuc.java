package quanlishopgiay;

import java.util.Scanner;

abstract class DanhMuc {
	private String msp,tensp,nuocsx;

	
	
     public DanhMuc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DanhMuc(String msp, String tensp, String nuocsx) {
		super();
		this.msp = msp;
		this.tensp = tensp;
		this.nuocsx = nuocsx;
	}
	
	public String getMsp() {
		return msp;
	}
	public void setMsp(String msp) {
		this.msp = msp;
	}
	public String getTensp() {
		return tensp;
	}
	public void setTensp(String tensp) {
		this.tensp = tensp;
	}
	public String getNuocsx() {
		return nuocsx;
	}
	public void setNuocsx(String nuocsx) {
		this.nuocsx = nuocsx;
	}
	public void Nhap() {
    	 Scanner sc =new Scanner(System.in);
    	 System.out.println("Nhập thông tin:");
    	 System.out.println("Nhập Mã sản phẩm:");
    	 msp=sc.nextLine();
    	 System.out.println("Nhập tên sản phẩm: ");
    	 tensp=sc.nextLine();
    	 System.out.println("Nhập nước sản xuất: ");
    	 nuocsx=sc.nextLine();
     }
     public void Xuat() {
    	 System.out.println("Tên mã sản phẩm: "+msp);
    	 System.out.println("Tên sản phẩm: "+tensp);
    	 System.out.println("Nước sản xuất: "+nuocsx);
     }
     public String GetFileline() {
    	 return tensp+"\t"+tensp+"\t"+nuocsx+"\n";
     }
}

