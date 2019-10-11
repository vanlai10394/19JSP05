package Quanly;

public class Kysu extends Canbo {
	String nganhdaotao;
	public Kysu(String hoten, int namsinh, String gioitinh, String diachi,String nganhdaotao) {
		super(hoten, namsinh, gioitinh, diachi);
		this.nganhdaotao=nganhdaotao;
		// TODO Auto-generated constructor stub
	}
	public void print() {
		System.out.println("Ho ten :"+this.hoten+"\tgioitinh"+this.diachi+"\tnganh dao tao :"+this.nganhdaotao);;
	}


}
