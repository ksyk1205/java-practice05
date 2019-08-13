package prob6;

public class RectTriangle extends Shape {

	public RectTriangle(double w, double h) {
		super.setHeight(h);
		super.setWidth(w);
	}

	@Override
	public double getArea() {
		return super.getWidth()*super.getHeight()*1/2;
	}

	@Override
	public double getPerimeter() {
		return super.getWidth()+super.getHeight()+(Math.sqrt(super.getWidth()*super.getWidth()+super.getHeight()*super.getHeight()));
	}

}
