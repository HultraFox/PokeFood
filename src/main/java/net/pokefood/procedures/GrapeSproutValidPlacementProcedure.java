package net.pokefood.procedures;

public class GrapeSproutValidPlacementProcedure {
	public static boolean execute(double y) {
		boolean returned = false;
		if (y >= 90 && y <= 125) {
			returned = true;
		} else {
			returned = false;
		}
		return returned;
	}
}
