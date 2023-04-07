package advance.dev;

public class Teacher extends Person{
	private	String maGV;
	private Double heSL;
	public Teacher(String name, int age, String phone, String maGV, Double heSL) {
		super(name, age, phone);
		this.maGV = maGV;
		this.heSL = heSL;
	}
	public String getMaGV() {
		return maGV;
	}
	public void setMaGV(String maGV) {
		this.maGV = maGV;
	}
	public Double getHeSL() {
		return heSL;
	}
	public void setHeSL(Double heSL) {
		this.heSL = heSL;
	}
	public double tinhLuong() {
		return this.heSL * 15.000000;
	}
	
}
