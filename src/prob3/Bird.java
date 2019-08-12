package prob3;

public abstract class Bird {
	private String name;
	
	public abstract void sing();

	public abstract void fly();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public abstract String toString();

}
