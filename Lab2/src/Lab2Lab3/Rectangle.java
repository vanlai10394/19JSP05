package Lab2Lab3;

public class Rectangle extends Shape {
	int height;
	int width;
	public Rectangle(String color,int height,int width) {
		super(color);
		this.height=height;
		this.width=width;
	
	}
	public double getArea() {
		super.getArea();
		System.out.println(height*width);
		return height*width;
	}
	public String toString() {
		System.out.print("Dien tich hinh chu nhat :");
		return "Dien tich hinh chu nhat :";
		
	}
	
	
}
