package model;

public class StateCoordinates {

	public Latitude latidude;
	public Longitude longitude;

	public StateCoordinates() {
		super();
	}

	public StateCoordinates(Latitude la, Longitude lo) {
		this.latidude = la;
		this.longitude = lo;
	}


	/**
	 * Calculates the distance, in kilometers, between the instanced 
	 * {@code StateCoordinate} and another {@code Point} instance.
	 * 
	 * Uses the "Distance Between Points" formula to get the value:
	 * D² = (Xb - Xa)² + (Yb - Ya)²
	 * 
	 * @param p the {@code Point} to takes as second variable in the calculation
	 * @return distance in kilometers, between {@code this} and {@code p}
	 */
	public static double calcDistance(StateCoordinates a, StateCoordinates b) {
		
		Angle latitudeDifference = a.getLatitudeSubtraction(b.latidude);
		Angle longitudeDifference = a.getLongitudeSubtraction(b.longitude);
		
		
		double latitudeDifference_km = latitudeDifference.toMeters();
		double longitudeDifference_km = longitudeDifference.toMeters();
		 
		return Math.sqrt(Math.pow(latitudeDifference_km, 2) + Math.pow(longitudeDifference_km, 2));
	}
	
	public Angle getLatitudeSubtraction(Angle b) {
		return latidude.minus(b);
	}

	public Angle getLongitudeSubtraction(Angle b) {
		return longitude.minus(b);
	}
	
	public double getLatitudeToKilometers() {
		return latidude.toMeters();
	}
	
	public double getLongitudeToKilometers() {
		return longitude.toMeters();
	}

}
