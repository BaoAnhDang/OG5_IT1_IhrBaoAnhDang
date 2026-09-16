package de.oszimt.starsim2099;

/**
 * Write a description of class Raumschiff here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Raumschiff {

	// Attribute

	// Methoden
	public void setTyp(String typ) {

	}

	public void setAntrieb(String Antrieb) {

	}

	public void setMaxKapazitaet(int maxKapazitaet) {

	}

	public void setWinkel(int winkel) {

	}

	public void setPosX(double PosX) {

	}

	public void setPosY(double PosY) {

	}
	
	public String getTyp() {
		return null;
	}
	
	public String getAntrieb() {
		return null;
	}
	
	public int getMaxKapazitaet() {
		return 0;
	}
	
	public int getWinkel() {
		return 0;
	}
	
	public int getPosX() {
		return 0;
	}
	public int getPosY() {
		return 0;
	}
	// Darstellung
	public static char[][] getDarstellung() {
		char[][] raumschiffShape = { 
				{'\0', '\0','_', '\0', '\0'},
				{'\0', '/', 'X', '\\', '\0'},
				{'\0', '{', 'X', '}', '\0'},
				{'\0', '{', 'X', '}', '\0'},
				{'/', '_', '_','_', '\\'},				
		};
		return raumschiffShape;
	}
}
