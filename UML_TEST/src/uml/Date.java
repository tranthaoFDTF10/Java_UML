package uml;

import java.util.Scanner;

public class Date {
	private int ngay;
	private int thang;
	private int nam;
	public Date() {
		ngay=9;
		thang=11;
		nam=2001;
	}
	public Date(int d, int m, int y) {
		ngay=d;
		thang=m;
		nam=y;
	}
	public Date(Date obj) {
		ngay=obj.ngay;
		thang=obj.thang;
		nam=obj.nam;
	}
	public int getNgay() {
		return ngay;
	}
	public int getThang() {
		return thang;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("\nNhap ngay = ");
			ngay = sc.nextInt();
			System.out.print("\nNhap thang = ");
			thang = sc.nextInt();
			System.out.print("\nNhap nam = ");
			nam = sc.nextInt();
			if(!hople()) System.out.print("\nKhong hop le, ban nhap lai: ");
		}while(!hople());
		//sc.close();
	}
	public void in() {
		System.out.println(ngay+"/"+thang+"/"+nam);
	}
	@Override
	public String toString() {
		String t=ngay+"/"+thang+"/"+nam+"\n";
		return t;
	}
	public boolean hople() {
		boolean h=true;
		int max[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if((nam%4==0 && nam%100==0)||(nam%400==0)) max[2]=29;
		if(thang>0 && nam>0 && thang<13 && ngay>0 && ngay<=max[thang]) {
			return h;
		}
		return false;
	}
	public Date ngayHomSau(){
        Date d = new Date(ngay,thang,nam);
        //int max[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        //if(nam%4==0 && nam%100!=0 || nam%400==0) max[2]=29;
        d.ngay=ngay+1; //tang ngay len
        if(!d.hople()){ //kiem tra neu ngay vuot qua so ngay trong thang 
            d.ngay=1; //thi giam so ngay xuong con 1
            d.thang=thang+1; //thang tang len
            if(!d.hople()){ //neu thang tang len 13
                d.thang=1; // thang giam xuong 1
                d.nam=nam+1; // nam se tang len 
            }
        }
        return d;
    }
    public Date congNgay(int n){
        Date d = new Date(ngay,thang,nam);
        for(int i=0;i<n;i++){
            d=d.ngayHomSau(); // bat buoc phai gan gia tri d vì d se tham chieu toi tung phan tu cua i, tao ra cac gia tri khac nhau
            //lay 1 bien ket qua de nhan lai ket qua tra lai
        }
        return d;
    }
}
