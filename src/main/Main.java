package main;

import model.Latitude;
import model.Longitude;
import model.State;
import model.StateCoordinates;
import model.StatesEnum;

@SuppressWarnings("unused")
public class Main {

	private static State estado1;
	private static State estado2;

	public static void main(String[] args) {

		estado1 = new State(StatesEnum.AM);
		estado2 = new State(StatesEnum.RS);

		System.out.println(estado1);
		System.out.println(estado2);
		
		System.out.printf("Distância entre %s e %s em linha reta: %.2f km", estado1.initials, estado2.initials, estado1.distanceTo(estado2) / 1000);

	}

}
