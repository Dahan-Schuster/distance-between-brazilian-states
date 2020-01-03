package model;

public class State {

	public String name;
	public String initials;
	public StateCoordinates coordinates;

	public State(StatesEnum eState) {
		try {
			this.initials = eState.toString();
			this.name = eState.getName();
			this.coordinates = new StateCoordinates(eState.getLatitude(), eState.getLongitude());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Returns the distance, in meters, between the instanced {@code State} and
	 * another {@code State}.
	 * 
	 * @param s the {@code State} to takes as second variable in the verification
	 * @return distance in meters, between {@code this} and {@code s}
	 */
	public double distanceTo(State s) {
		return this.equals(s) ? 0 : StateCoordinates.calcDistance(this.coordinates, s.coordinates);
	}

	/**
	 * Returns whether or not the instanced State is equal to another one. Two
	 * states are equal if their names, initial and coordinates are equal.
	 */
	public boolean equals(Object obj) {
		if (obj instanceof State) {
			State s = (State) obj;
			return (name.equals(s.name)) && (initials.equals(s.initials)) && (coordinates.equals(s.coordinates));
		}

		return super.equals(obj);
	}
	
	public String toString() {
		return name + " - " + initials + " [" + coordinates.latidude + ", " + coordinates.longitude + "]"; 
	}

}
