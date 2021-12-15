import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien sv = new SinhVien();
		Scanner scan = new Scanner(System.in);
		sv.nhap(scan);
		sv.diemTB();
		sv.xepLoai();
		sv.xuat();
		
		SinhVien sv1 = new SinhVien();
		sv1.nhap(scan);
		sv1.diemTB();
		sv1.xepLoai();
		sv1.xuat();
		SinhVien sv2 = new SinhVien();
		sv2.nhap(scan);
		sv2.diemTB();
		sv2.xepLoai();
		sv2.xuat();
	}

}
