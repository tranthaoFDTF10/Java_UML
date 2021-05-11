package uml;

import java.util.Scanner;

public class HangHoa {
	private String TenHH;
	private String NSX;
	
	public HangHoa() {
		TenHH = new String();
		NSX = new String();
	}
	public HangHoa(String tenhh, String nsx) {
		TenHH = tenhh;
		NSX = nsx;
	}
	public HangHoa(HangHoa h) {
		TenHH = new String(h.TenHH);
		NSX = new String(h.NSX);
	}
	public void nhapHH() {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		System.out.print("Nhap ten hang hoa: ");
		TenHH = sc.nextLine();
		System.out.print("Nhap ten nha san xuat: ");	
		NSX = sc.nextLine();
		
		//sc.close();
	}
	public void inTTHH() {
		System.out.print("\nTen hang hoa: "+TenHH);
		System.out.print("\nNha san xuat: "+NSX);
		
	}
	@Override
	public String toString() {
		String t="";
		t+="Ten hang hoa: "+TenHH+"\n";
		t+="Nha san xuat: "+NSX+"\n";
		return t;
	}
}
