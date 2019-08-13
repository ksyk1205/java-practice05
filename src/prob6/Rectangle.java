package prob6;

public class Rectangle extends Shape implements Resizable {

	public Rectangle(double w, double h) {
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

	@Override
	public void resize(double d) {
		this.setHeight(this.getHeight() * d);
		this.setWidth(this.getWidth()*d);
	}
}
