import java.util.Scanner;

public class SinhVien {

	// thuoc tinh
	private String name;
	private String maSV;
	private double diemToan;
	private double diemLy;
	private double diemHoa;
	private double diemTB;
	private String xepLoai;
	
	//phuong thuc khoi tao khong tham so
	public SinhVien() {

	}
	
	//phuong thuc khoi tao co tham so
	public SinhVien(String name, String maSV, double diemToan, double diemLy, double diemHoa, String xepLoai) {
		this.name = name;
		this.maSV = maSV;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
		
	}
	
	// get, set method
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public double getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}

	public double getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(double diemLy) {
		this.diemLy = diemLy;
	}

	public double getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(double diemHoa) {
		this.diemHoa = diemHoa;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public String getXepLoai() {
		return xepLoai;
	}
	//nhap, xuat
	public void nhap(Scanner scan) {
		System.out.println("nhap ten: ");
		this.name = scan.nextLine();
		
		System.out.println("nhap ma sv: ");
		this.maSV = scan.nextLine();
		
		System.out.println("nhap diem toan: ");
		this.diemToan = Double.parseDouble(scan.nextLine());
		
		System.out.println("nhap diem ly: ");
		this.diemLy = Double.parseDouble(scan.nextLine());
		
		System.out.println("nhap diem hoa: ");
		this.diemHoa = Double.parseDouble(scan.nextLine());
	}
	
	public void xuat() {
		System.out.println("Sinh vien - Ma: " + this.maSV + "\t Ten: " +this.name
				+"\t Toan: " + this.diemToan
				+"\t Ly: "+this.diemLy
				+"\t Hoa: "+this.diemHoa
				+"\t Diem TB: "+this.diemTB
				+"\t Xep Loai: "+this.xepLoai);
	}
	
	//business method
	public void diemTB() {
		this.diemTB =  (this.diemToan + this.diemLy + this.diemHoa)/3;
	}
	
	public void xepLoai() {
		if(this.diemTB >= 9) {
			this.xepLoai = "Xuat sac";
		}else if(this.diemTB >= 8) {
			this.xepLoai = "Gioi";
		}else if(this.diemTB >= 7) {
			this.xepLoai = "Kha";
		}else if(this.diemTB >= 6) {
			this.xepLoai = "TB-Kha";
		}else if(this.diemTB >= 5) {
			this.xepLoai = "Trung Binh";
		}else {
			this.xepLoai = "Yeu";
		}
	}

}
