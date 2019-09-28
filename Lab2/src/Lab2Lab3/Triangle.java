package Lab2Lab3;

public class Triangle extends Shape {
	int base;
	int height;
	public Triangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}
	public double getArea() {
		System.out.println(0.5*base*height);
		return 0.5*base*height;
	}
	public String toString() {
		System.out.print("Dien tich hinh tam tam giac ");
		return "Dien tich hinh tam tam giac ";
	}
}
