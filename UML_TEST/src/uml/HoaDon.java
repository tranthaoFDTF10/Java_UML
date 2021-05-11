package uml;
import java.util.Scanner;
public class HoaDon {
	private String MaSoHD; //Ma so hoa don
	private String NoiDungHD; //Noi dung mua
	private Date NgayLapHD; //ngay lap hoa don
	private KhachHang KH; // khach hang 
	private KhachHangVIP KHV;
	private ChiTietHH c[]; // Chi tiet hang hoa la mang cac hang hoa
	private int SoLuongCT; //so luong chi tiet hang hoa
	int chon; //Bien toan cuc de phan bien Khach hang va khach hang VIP
	public HoaDon() {
		MaSoHD = new String();
		NoiDungHD = new String();
		NgayLapHD = new Date();
		KH = new KhachHang();
		KHV = new KhachHangVIP();
		c = new ChiTietHH[20];
		SoLuongCT = 0;
	}
	public HoaDon(String ms, String nd, Date n, KhachHang k,KhachHangVIP kv, ChiTietHH ct[], int sl) {
		MaSoHD = new String(ms);
		NoiDungHD = new String(nd);
		NgayLapHD = new Date(n);
		KH = new KhachHang(k);
		KHV = new KhachHangVIP(kv);
		c = ct;
		this.SoLuongCT = sl;
	}
	public HoaDon(HoaDon hd) {
		MaSoHD = new String(hd.MaSoHD);
		NoiDungHD = new String(hd.NoiDungHD);
		NgayLapHD = new Date(hd.NgayLapHD);
		KH = new KhachHang(hd.KH);
		KHV = new KhachHangVIP(hd.KHV);
		this.SoLuongCT = hd.SoLuongCT;
		for(int i=0;i<SoLuongCT;i++) {
			c[i] = new ChiTietHH();
		}
	}
	public void nhapHD() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap ma so hoa don: ");
		MaSoHD = sc.nextLine();
		System.out.print("\nNhap noi dung hoa don: ");
		NoiDungHD = sc.nextLine();
		System.out.print("\nNhap ngay lap hoa don: ");
		NgayLapHD.nhap();
		System.out.print("\nNhap thong tin khach hang: ");
		System.out.print("\nKhach hang la VIP? (1) Phai, (0) Khong");
		chon = sc.nextInt();
		if(chon==1) {
			KH.nhapKH();
			KHV.nhapTTVip();
		}else {
			KH.nhapKH();
		}
		System.out.print("\nNhap so luong chi tiet hang hoa: ");
		SoLuongCT = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<SoLuongCT;i++) {
			System.out.print("Nhap thong tin hang hoa thu "+(i+1)+": ");
			c[i] = new ChiTietHH();
			c[i].nhapChiTiet();
			sc.nextLine();
		}
		//sc.close();
	}
	public void inHD() {
		System.out.println("Ma so hoa don: "+MaSoHD);
		System.out.println("Noi dung hoa don: "+NoiDungHD);
		System.out.println("Ngay lap hoa don: "+NgayLapHD);
		System.out.println("Thong tin khach hang: ");
		if(chon==1) {
			KH.inKH();
			KHV.inKHV();
		}
		else {
			KH.inKH();
		}
		System.out.println("So luong chi tiet hang hoa: "+SoLuongCT);
		for(int i=0;i<SoLuongCT;i++) {
			System.out.println("+  Thong tin hang hoa thu "+(i+1)+": ");
			c[i].inChiTiet();
		}
	}
	@Override
	public String toString() {
		String t="";
		t+="Ma so hoa don: "+MaSoHD+"\n";
		t+="Noi dung hoa don: " +NoiDungHD+"\n";
		t+="Ngay lap hoa don: "+NgayLapHD+"\n";
		t+="So luong chi tiet hang hoa: "+SoLuongCT+"\n";
		t+="Thong tin khach hang: "+KH+"\n";
		if(chon==1) {
			t+=KH+"\n";
			t+=KHV+"\n";
		}
		else {
			t+=KH+"\n";
		}
		for(int i=0;i<SoLuongCT;i++) {
			t+="+  Thong tin hang hoa thu "+(i+1)+": "+c[i]+"\n";
		}
		return t;
	}
	public void TienHD() {  //Tong tien cua mot hang hoa
		for(int i=0;i<SoLuongCT;i++) {
			if(chon==1) {
				long TongTien=c[i].getSoLuongHH()*c[i].getDonGia();
				double ThanhTien=(double)TongTien*KHV.getTiLeGiam();
				System.out.print("=> Mat hang "+c[i].getMaSoHH()+" co gia: "+ThanhTien+"\n");
			}
			else{
				long TongTien=c[i].getSoLuongHH()*c[i].getDonGia();
				System.out.print("=> Mat hang "+c[i].getMaSoHH()+" co gia: "+TongTien+"\n");
			}
		}
	}
	public double TongTienHD() { //Tong tien cua mot hoa don
		double ThanhTien=0;
		long Tong=0;
		for(int i=0;i<SoLuongCT;i++) {
			Tong+=c[i].getSoLuongHH()*c[i].getDonGia();
		}
		if(chon==1) {
			ThanhTien=(double)Tong*KHV.getTiLeGiam();
		}
		else {
			ThanhTien=(double)Tong;
		}
		return ThanhTien;
	}
}
