package pointsInThePlane;

public class Point {
	private final int X, Y;

	public Point(int x, int y) {
		X = x;
		Y = y;
	}

	public int getX() {	

		return X;
	}

	public int getY() {

		return Y;
	}
	public String toString(){
		return "("+X + ","+Y+")"; 
		
	}

	public double Distance(Point pnt) {
		return Math.sqrt(Math.pow((X - pnt.getX()), 2) + Math.pow((Y - pnt.getY()), 2));
		 
	}
}
