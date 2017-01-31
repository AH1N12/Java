package pointsInThePlane;

public class Plane {
	private Point[] plane;

	public Plane(Point[] p) {
		plane = p;
	}
	public Point[] getPlane(){
		return plane;
	}
	
	public  double nearestPoints() {

		Point temp, A=null,B=null;
		double distance=Integer.MAX_VALUE;
		// System.out.println(distance);
		for (int i = 0; i < this.plane.length; i++) {
			Point current = this.plane[i];
			for (int j = 0; j < this.plane.length; j++) {
				if (j == i)
					continue;
				temp = (this.plane[j]);
				
				if (distance >= current.Distance(temp)) {
					A=temp;
					B=current;
					distance = current.Distance(temp);
				}
			}

		}
		System.out.println("A: " +A.toString()+ " " + "B: " + B.toString());
		return distance;
	}
	
	public  double farestPoints() {

		Point temp, A=null,B=null;
		double distance=0;
		// System.out.println(distance);
		for (int i = 0; i < this.plane.length; i++) {
			Point current = this.plane[i];
			for (int j = 0; j < this.plane.length; j++) {
				if (j == i)
					continue;
				temp = (this.plane[j]);
				
				if (distance <= current.Distance(temp)) {
					A=temp;
					B=current;
					distance = current.Distance(temp);
				}
			}

		}
		System.out.println("A: " +A.toString()+ " " + "B: " + B.toString());
		return distance;
	}
}