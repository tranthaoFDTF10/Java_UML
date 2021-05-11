package uml;
import java.util.Scanner;
public class KhachHangVIP extends KhachHang {
	private Date NgayGiam;
	private double TiLeGiam;
	
	public KhachHangVIP() {
		super();
		NgayGiam = new Date();
		TiLeGiam = 0;
	}
	public KhachHangVIP(String tenkh,String phone,String dc, boolean gt, Date ns, Date ngaygiam, double tlgiam) {
		super(tenkh,phone,dc,gt,ns);
		NgayGiam = new Date(ngaygiam);
		TiLeGiam = tlgiam;
	}
	public KhachHangVIP(KhachHangVIP khv) {
		super(khv);
		NgayGiam = new Date(khv.NgayGiam);
		TiLeGiam = khv.TiLeGiam;
	}
	public void nhapKHV() {
		System.out.print("\nNhap thong tin khach hang VIP: ");
		super.nhapKH();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap ngay duoc giam: ");
		NgayGiam.nhap();
		System.out.print("\nNhap ti le giam: ");
		TiLeGiam = sc.nextDouble();
		//sc.close();
	}
	public void nhapTTVip() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap thong tin khach hang VIP: ");
		System.out.print("\nNhap ngay duoc giam: ");
		NgayGiam.nhap();
		System.out.print("\nNhap ti le giam: ");
		TiLeGiam = sc.nextDouble();
	}
	public void inKHV() {
		super.toString();
		System.out.println("Ngay duoc giam: "+NgayGiam);
		System.out.println("Ti le giam: "+TiLeGiam);
	}
	@Override
	public String toString() {
		String t="";
		//t+=super.toString()+"\n";
		t+="Ngay duoc giam: "+NgayGiam+"\n";
		t+="Ti le giam: "+TiLeGiam+"\n";
		return t;
	}
	@Override
	public Date getNgayGiam() {
		return NgayGiam;
	}
	@Override
	public double getTiLeGiam() {
		return TiLeGiam;
	}
}
