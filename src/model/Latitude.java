package model;

public class Latitude extends Angle {

	public static final char SOUTH = 'S';
	public static final char NORTH = 'N';

	public char direction;

	public Latitude(int d, int m, double s, char direction) throws Exception {
		super(d, m, s);
		this.direction = direction;
		
		if (d > 180 || d < 0) throw new Exception("Value in degrees lower/higher than allowed for latitudes");
		if (direction != SOUTH && direction != NORTH) throw new Exception("Direction not allowed for latitudes");
	}

	public String toString() {
		return this.degrees + "º" + this.minutes + "\'" + this.seconds + "\"" + direction;
	}

}
