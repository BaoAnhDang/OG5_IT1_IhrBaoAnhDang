package de.oszimt.starsim2099;

/**
 * Write a description of class Planet here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Planet {

	// Attribute
	private int anzahlHafen;
	private String name;
	private double posX;
	private double posY;

	// Methoden
	public void setAnzahlHafen(int anzahlHafen) {
		this.anzahlHafen = anzahlHafen;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPosX(double posX) {
		this.posX = posX;
	}

	public void setPosY(double posY) {
		this.posY = posY;
	}

	public int getAnzahlHafen() {
		return anzahlHafen;
	}

	public String getName() {
		return name;
	}

	public double getPosX() {
		return posX;
	}

	public double getPosY() {
		return posY;
	}

	public static char[][] getDarstellung() {
		char[][] planetShape = {
				{ '\0', '/', '*', '*', '\\', '\0' },
				{ '|', '*', '*', '*', '*', '|' },
				{ '\0', '\\', '*', '*', '/', '\0' }
		};

		return planetShape;
	}
}