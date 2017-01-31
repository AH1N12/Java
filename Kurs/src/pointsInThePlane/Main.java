package pointsInThePlane;

public class Main {

	public static void main(String[] args) {
		
		Point table[] = {new Point(0,0),new Point(2,4),new Point(2,0),new Point(4,0),new Point(0,-3)};
		
		System.out.println("The shortest distance bestween points: " + new Plane(table).nearestPoints());
		System.out.println("The longest distance bestween points: " + new Plane(table).farestPoints());
	}

}
