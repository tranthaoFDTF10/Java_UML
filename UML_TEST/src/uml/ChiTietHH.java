package uml;

import java.util.Scanner;

public class ChiTietHH {
	private HangHoa h;
	private String MaSoHH;
	private int SoLuongHH;
	private long DonGia;
	
	public ChiTietHH() {
		h =new HangHoa();
		MaSoHH = new String();
		SoLuongHH = 0;
		DonGia = 0;
	}
	public ChiTietHH(HangHoa hh, String mshh, int slhh, long dg) {
		h = new HangHoa(hh);
		MaSoHH = mshh;
		SoLuongHH = slhh;
		DonGia = dg;
	}
	public ChiTietHH(ChiTietHH ct) {
		h = new HangHoa(ct.h);
		MaSoHH = new String(ct.MaSoHH);
		SoLuongHH = ct.SoLuongHH;
		DonGia = ct.DonGia;
	}
	public void nhapChiTiet() {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		System.out.print("Nhap hang hoa: ");
		h.nhapHH();
		System.out.print("Nhap ma so hang hoa: ");
		MaSoHH = sc.nextLine();
		System.out.print("Nhap so luong: ");
		SoLuongHH = sc.nextInt();
		System.out.print("Nhap don gia: ");
		DonGia = sc.nextLong();
		//sc.close();
	}
	public void inChiTiet() {
		System.out.println("Hang hoa: "+h.toString());
		System.out.println("\n+ Ma so hang hoa: "+MaSoHH);
		System.out.println("\n+ So luong hoa hoa: "+SoLuongHH);
		System.out.println("\n+ Don Gia: "+DonGia);
		
	}
	@Override
	public String toString() {
		String t="";
		t+="Hang Hoa: "+h.toString()+"\n";
		t+="+ Ma so hang hoa: "+MaSoHH+"\n";
		t+="+ So luong hang hoa: "+SoLuongHH+"\n";
		t+="+ Don gia: "+DonGia+"\n";
		return t;
	}
	public int getSoLuongHH() {
		return SoLuongHH;
	}
	public long getDonGia() {
		return DonGia;
	}
	public String getMaSoHH() {
		return MaSoHH;
	}
	
}
