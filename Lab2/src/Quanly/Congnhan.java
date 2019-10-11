package Quanly;

public class Congnhan extends Canbo {
	double bac;
	public Congnhan(String hoten, int namsinh, String gioitinh, String diachi,double bac) {
		super(hoten, namsinh, gioitinh, diachi);
		this.bac=bac;
		// TODO Auto-generated constructor stub
	}
	public void print() {
		System.out.println("hoten :"+this.hoten+"\tgioitinh :"+this.gioitinh+"\tdiachi :"+this.diachi+"\tbac :"+this.bac);
	}



}
