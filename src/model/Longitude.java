package model;

public class Longitude extends Angle {

	public static final char LEST = 'L';
	public static final char WEST = 'W';

	public char direction;

	public Longitude(int d, int m, double s, char direction) throws Exception {		
		super(d, m, s);
		this.direction = direction;
		
		if (d > 180 || d < 0) throw new Exception("Value in degrees lower/higher than allowed for longitudes");
		if (direction != LEST && direction != WEST) throw new Exception("Direction not allowed for longitudes");
	}

	public String toString() {
		return this.degrees + "º" + this.minutes + "\'" + this.seconds + "\"" + direction;
	}

}
