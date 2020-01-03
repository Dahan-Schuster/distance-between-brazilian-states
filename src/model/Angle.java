package model;

public class Angle {

	public int degrees;
	public int minutes;
	public double seconds;

	public Angle(int d, int m, double s) {
		this.degrees = d;
		this.minutes = m;
		this.seconds = s;
	}

	/**
	 * 
	 * This method takes turns the coordinate in degrees into kilometers. 
	 * 
	 * Uses the formula: km = ((dº * 60) + (m' * 1) + (s" / 60)) * 1,852
	 * 
	 * @return double the value of the degrees in kilometers
	 */
	public double toMeters() {
		return ((degrees * 60) + minutes + ((double) seconds / 60)) * 1852;
	}
	
	public Angle minus(Angle b) {
		Angle a = new Angle(degrees, minutes, seconds);
		Angle result = new Angle(0, 0, 0);
		
		if (a.seconds - b.seconds < 0) {
			a.minutes--;
			a.seconds += 60;
		}

		if (a.minutes - b.minutes < 0) {
			a.degrees--;
			a.minutes += 60;
		}
		
		result.seconds = a.seconds - b.seconds;
		result.minutes = a.minutes - b.minutes;
		result.degrees = a.degrees - b.degrees;
		
		return result;
	}

	public String toString() {
		return this.degrees + "º" + this.minutes + "\'" + this.seconds + "\"";
	}

}
