package Shape;

import java.util.Comparator;


public class Cuboid extends Rectangle{
	
	private int iDepth;
	
	public Cuboid(int iWidth, int iLength, int iDepth) {
		super(iWidth, iLength);
		this.iDepth = iDepth;
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	
	public double volume() {
		double volumeC= this.getiLength()* iDepth* this.getiWidth();
		return volumeC;
	}
	
	@Override
	public double area() {
		double areaC= 2*((this.getiLength()*this.getiWidth())+(iDepth*this.getiWidth())+(this.getiLength()*iDepth));
		return areaC;
	}

	@Override
	public double perimeter() throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}	
	
	
}
	 class SortByArea implements Comparator <Cuboid>{
		 SortByArea() {
			
		}
		
		public int compare(Cuboid a, Cuboid b) {
			return (int) ( a.area()- b.area());
	}
	}
	
	class SortByVolume implements Comparator <Cuboid>{
		 SortByVolume() {
			
		}
		
		public int compare(Cuboid a, Cuboid b) {
			return (int) (a.volume()-b.volume());
	}
}

