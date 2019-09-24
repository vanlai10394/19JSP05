package Lab5;


import java.util.ArrayList;
import java.util.Scanner;
public class Lab5 {
	String name;
	int age;
	String gioitinh;
	
	public Lab5(String name, int age, String gioitinh) {
		super();
		this.name = name;
		this.age = age;
		this.gioitinh = gioitinh;
	}
	public void  print() {
		System.out.println("Ten :"+this.name+"Tuoi"+this.age+"Gioi tinh"+this.gioitinh);
	}
	public static void main(String[] args) {
		ArrayList<Lab5>  nhanvien = new ArrayList<Lab5>();
		// TODO Auto-generated method stub
		while(true) {
		System.out.println("moi nhap menu");
		System.out.println("1.creat employee"+"\t 2.show employee"+"\t 3.exit");
		int number = new Scanner (System.in).nextInt();
		switch (number) {
		case 1:
			System.out.println("creat Employee");
			System.out.println("Moi nhap thong tin");
			System.out.println("ten :");
			String name = new Scanner(System.in).nextLine();
			System.out.println("tuoi :");
			int age = new Scanner (System.in).nextInt();
			System.out.println("gioi tinh:");
			String gioitinh = new Scanner(System.in).nextLine();
			Lab5  nv= new Lab5(name, age, gioitinh);
			nhanvien.add(nv);
			break ;
		case 2 :
			System.out.println("Show employee :");
			for(Lab5 s : nhanvien) {
				s.print();
			}break;
		case 3:
			System.err.println("Exit");
			System.exit(0);
			break;
		}
	}
	}

}
