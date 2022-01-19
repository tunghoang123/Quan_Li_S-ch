package quanlishopgiay;

import java.util.Scanner;

 class SanPham extends DanhMuc {
       private String size,ngaynhap;
       private int giasp;
	public SanPham(String size, String ngaynhap, int giasp) {
		super();
		this.size = size;
		this.ngaynhap = ngaynhap;
		this.giasp = giasp;
	}
	public SanPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getNgaynhap() {
		return ngaynhap;
	}
	public void setNgaynhap(String ngaynhap) {
		this.ngaynhap = ngaynhap;
	}
	public int getGiasp() {
		return giasp;
	}
	public void setGiasp(int giasp) {
		this.giasp = giasp;
	}

	public void Nhap() {
		super.Nhap();;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập Size: ");
		size=sc.nextLine();
		System.out.println("Ngày nhập: ");
		size=sc.nextLine();
		System.out.println("Nhập giá giày: ");
		giasp=sc.nextInt();
	}
	public void Xuat() {
		super.Xuat();
		System.out.println("Loại giày"+ngaynhap);
		System.out.println("SIZE Giày: "+size);
		System.out.println("Giá giày: "+giasp);
		System.out.println("===========");
	}
	public String GetFileline() {
		return size+"\t"+ngaynhap+"\t"+giasp+super.GetFileline();
	}
}
