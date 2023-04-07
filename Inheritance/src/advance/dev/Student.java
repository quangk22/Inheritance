package advance.dev;

public class Student extends Person {
	private double diemToan;
	private double diemLy;
	private double diemHoa;
	private String maSV;
	private String lop;

	public Student(String name, int age, String phone, double diemToan, double diemLy, double diemHoa, String maSV,
			String lop) {
		super(name, age, phone);
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
		this.maSV = maSV;
		this.lop = lop;
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

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}
	public Double diemTB() {
		return (this.diemHoa + this.diemLy + this.diemToan)/3;
	}
}
