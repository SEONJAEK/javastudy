package prob6;

public class Rectangle extends Shape implements Resizable{

	private double width;
	private double height;

	public Rectangle(double w, double h) {
		this.width = w;
		this.height = h;
	}

	@Override
	double getArea() {
		return width * height;
	}

	@Override
	double getPerimeter() {
		return width*2 + height*2;
	}

	@Override
	public void resize(double s) {
		width = width * s;
		height = height * s;
		
	}

}