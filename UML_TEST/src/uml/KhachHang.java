package uml;

import java.util.Scanner;

public class KhachHang {
	private String tenKH;
	private String sdt;
	private String diachiKH;
	private boolean gioitinh;
	private Date NgaySinh;
	
	public KhachHang() {
		tenKH = new String();
		diachiKH = new String();
		sdt = new String();
		gioitinh=true;
		NgaySinh = new Date();
	}
	public KhachHang(String tenkh, String diachikh,String dt, boolean gt,Date ns) {
		tenKH = new String(tenkh);
		diachiKH = new String(diachikh);
		sdt = new String(dt);
		gioitinh =gt;
		NgaySinh = new Date(ns);
	}
	public KhachHang(KhachHang kh) {
		tenKH = new String(kh.tenKH);
		diachiKH = new String(kh.diachiKH);
		sdt = new String(kh.sdt);
		gioitinh = kh.gioitinh;
		NgaySinh = new Date(kh.NgaySinh);
	}
	public void nhapKH() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap ten KH: ");
		tenKH = sc.nextLine();
		System.out.print("\nNhap dia chi KH: ");
		diachiKH = sc.nextLine();
		System.out.print("\nNhap SDT: ");
		sdt = sc.nextLine();
		System.out.print("\nNhap gioi tinh: true(nam), false(nu): ");
		gioitinh = sc.nextBoolean();
		System.out.print("\nNhap ngay sinh: ");
		NgaySinh.nhap();
		//sc.close();
	}
	public void inKH() {
		System.out.println("Ten KH: "+tenKH);
		System.out.println("Dia chi KH: "+diachiKH);
		System.out.println("SDT: "+sdt);
		if(gioitinh==true) {
			System.out.println("Gioi tinh: Nam");
		}else {
			System.out.println("Gioi tinh: Nu");
		}
		System.out.println("Ngay sinh: "+NgaySinh.toString());
	}
	@Override
	public String toString() {
		String t="";
		t+="Ten KH: "+tenKH+"\n";
		t+="Dia chi KH: "+diachiKH+"\n";
		t+="SDT: "+sdt+"\n";
		if(gioitinh==true) {
			t+="Gioi tinh: Nam";
		}else {
			t+="Gioi tinh: Nu";
		}
		t+="Ngay Sinh: "+NgaySinh+"\n";
		return t;
	}
	public Date getNgayGiam() {
		Date d = new Date(1,1,2001);
		System.out.println("Khong phai la khach vip. Khong co ngay giam!!!!");
		return d;
	}
	public double getTiLeGiam() {
		return 1;
	}
}
