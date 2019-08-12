package prob6;

public abstract class Shape {
	private double width,height;
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public abstract double getArea();//넓이
	
	public abstract double getPerimeter();//둘레 길이





}
