package de.oszimt.starsim2099;

/**
 * Write a description of class Planet here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Planet {

	// Attribute
	
	// Methoden
	public void setAnzahlHafen(int AnzahlHafen) {

	}
	public void setName(String Name) {

	}
	public void setPosX(double PosX) {

	}
	public void setPosY(double PosY) {

	}
	public int getAnzahlHafen() {
		return 0;
	}
	public String getName() {
		return null;
	}
	public double getPosX() {
		return 0;
	}
	public double getPosY() {
		return 0;
	}
	// Darstellung
	public static char[][] getDarstellung() {
		char[][] planetShape = { { '\0', '/', '*', '*', '\\', '\0' }, { '|', '*', '*', '*', '*', '|' },
				{ '\0', '\\', '*', '*', '/', '\0' } };
		return planetShape;

	}
}
