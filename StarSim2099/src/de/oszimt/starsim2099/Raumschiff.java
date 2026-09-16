package de.oszimt.starsim2099;

/**
 * Write a description of class Raumschiff here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Raumschiff {

	// Attribute
	private String typ;
	private String antrieb;
	private int maxKapazitaet;
	private int winkel;
	private double posX;
	private double posY;

	// Methoden
	public void setTyp(String typ) {
		this.typ = typ;
	}

	public void setAntrieb(String antrieb) {
		this.antrieb = antrieb;
	}

	public void setMaxKapazitaet(int maxKapazitaet) {
		this.maxKapazitaet = maxKapazitaet;
	}

	public void setWinkel(int winkel) {
		this.winkel = winkel;
	}

	public void setPosX(double posX) {
		this.posX = posX;
	}

	public void setPosY(double posY) {
		this.posY = posY;
	}

	public String getTyp() {
		return typ;
	}

	public String getAntrieb() {
		return antrieb;
	}

	public int getMaxKapazitaet() {
		return maxKapazitaet;
	}

	public int getWinkel() {
		return winkel;
	}

	public double getPosX() {
		return posX;
	}

	public double getPosY() {
		return posY;
	}

	public static char[][] getDarstellung() {
		char[][] raumschiffShape = {
				{ '\0', '\0', '_', '\0', '\0' },
				{ '\0', '/', 'X', '\\', '\0' },
				{ '\0', '{', 'X', '}', '\0' },
				{ '\0', '{', 'X', '}', '\0' },
				{ '/', '_', '_', '_', '\\' }
		};

		return raumschiffShape;
	}
}