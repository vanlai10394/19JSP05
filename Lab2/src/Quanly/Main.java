package Quanly;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Canbo> dsCanBo = new ArrayList<>();
	public static void timkiem() {
		System.out.println("Nhap ten can tim kiem");
		String ten=new Scanner(System.in).nextLine();
		boolean kt=false;
		for(Canbo s : dsCanBo) {
			if(ten.equalsIgnoreCase(s.getHoten())) {
				s.print();
				kt=true;
			}
		}
		if(kt==false) {
			System.out.println("Ten ban vua nhap khong dung");
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Congnhan congnhan1=new Congnhan("Long", 1995, "nam", "Danang", 1);
		Congnhan congnhan2=new Congnhan("Van", 1993, "nam", "Danang", 2);
		Kysu kysu1=new Kysu("Hoang", 1997, "Nam", "Danang", "Kientruc");
		Kysu kysu2=new Kysu("Van", 1997, "Nu", "Danang", "Kinhte");
		dsCanBo.add(congnhan1);
		dsCanBo.add(congnhan2);
		dsCanBo.add(kysu1);
		dsCanBo.add(kysu2);
		for(Canbo s: dsCanBo) {
			s.print();
		}

		timkiem();


	}}
