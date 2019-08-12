package prob6;

public class RectTriangle extends Shape {

	public RectTriangle(double w, double h) {
		super.setHeight(h);
		super.setWidth(w);
	}

	@Override
	public double getArea() {
		return super.getWidth()*super.getHeight();
	}

	@Override
	public double getPerimeter() {
		return (super.getWidth()+super.getHeight())*2;
	}

}
