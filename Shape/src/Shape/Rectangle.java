package Shape;

public class Rectangle extends Shape implements Comparable  {

	private int iWidth;
	private int iLength;
	
	public Rectangle(int iWidth, int iLength) {
		super();
		this.iWidth = iWidth;
		this.iLength = iLength;
	}


	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}

	@Override
	public double area() {
		double areaR =iWidth*iLength;
		return areaR;
	}

	@Override
	public double perimeter() {
		double perimeterR= 2*(iLength+iWidth);
		return perimeterR;
	}

	@Override
	public int compareTo(Object o) {
		Rectangle r =(Rectangle) o;
		int aRecCompare= (int) (this.area()-r.area());
	
		return aRecCompare;
	}
}
