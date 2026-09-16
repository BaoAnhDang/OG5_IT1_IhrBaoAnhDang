package de.oszimt.starsim2099;

/**
 * Write a description of class Pilot here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pilot {

	// Attribute
    private String grad;
    private String name;
    private double posX;
    private double posY;

    // Methoden
    public void setGrad(String grad) {
        this.grad = grad;
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

    public String getGrad() {
        return grad;
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
}