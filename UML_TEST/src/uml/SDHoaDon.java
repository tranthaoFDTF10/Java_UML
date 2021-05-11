package uml;
import java.util.Scanner;
public class SDHoaDon {
	public static void main(String[] args) {
		/*HoaDon h = new HoaDon();
		h.nhapHD();
		h.inHD();*/
		
		//Nhap danh sach cac mang tham chieu HoaDon
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong hoa don: ");
		int n = sc.nextInt();
		
		HoaDon ds[] = new HoaDon[n];
		for(int i=0;i<n;i++) {
			ds[i] = new HoaDon();
			System.out.print("Nhap hoa don thu "+(i+1)+": ");
			ds[i].nhapHD();
			
		}
		for(int i=0;i<n;i++) {
			System.out.print("***********Thong tin hoa don thu "+(i+1)+": "+"\n");
			ds[i].inHD();
		}
		
		//Tong Tien cua moi hoa don
		for(int i=0;i<n;i++) {
			System.out.print("***Gia cua tung mat hang***\n");
			ds[i].TienHD();
		}
		for(int i=0;i<n;i++) {
			System.out.print("***Tong tien cua hoa don thu "+(i+1)+": "+ds[i].TongTienHD()+"\n");
		}
		System.out.println("\nCam on quy khach da ung ho!!! Chuc quy khach mua sam vui ve");
	}
	
}
