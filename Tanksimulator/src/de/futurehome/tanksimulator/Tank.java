package de.futurehome.tanksimulator;


public class Tank {
	
	private double fuellstand;

	public Tank(double fuellstand) {
		this.fuellstand = fuellstand;
	}

	public double getFuellstand() {
		return fuellstand;
	}

	public void setFuellstand(double fuellstand) {
		this.fuellstand = fuellstand;
	}
	
	
	private double prozent;
	
	public double getProzent() {
		return prozent;
	}

	public void setProzent(double prozent) {
		this.prozent = prozent;
	}

}
