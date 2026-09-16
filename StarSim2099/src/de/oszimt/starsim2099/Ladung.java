package de.oszimt.starsim2099;

/**
 * Write a description of class Ladung here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ladung {

	// Attribute

	// Methoden
	public void setTyp(String Typ) {

	}
	public void setMasse(int masse) {

	}
	public void setPosX(double PosX) {

	}
	public void setPosY(double PosY) {

	}
	
	public String getTyp() {
		return null;
	}
	public int getMasse() {
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
		char[][] ladungShape = { { '/', 'X', '\\' }, { '|', 'X', '|' }, { '\\', 'X', '/' } };
		return ladungShape;
	}
}