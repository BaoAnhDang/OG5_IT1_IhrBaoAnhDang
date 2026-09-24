package omnom;

public class Haustier {

	int hunger = 100;
	int muede = 100;
	int zufrieden = 100;
	int gesund = 100;
	String name;

	public Haustier(String name) {
		this.name = name;
	}

	public int getHunger() {
		return hunger;
	}
	public void setHunger(int hunger) {
		if (hunger >= 0 && hunger<= 100) {
			this.hunger = hunger;
		}
	}
	public int getMuede() {
		return muede;
	}
	public void setMuede(int muede) {
		if (muede >= 0 && muede <= 100) {
			this.muede = muede;
		}
	}
	public int getZufrieden() {
		return zufrieden;
	}
	public void setZufrieden(int zufrieden) {
		if ( zufrieden >= 0 && zufrieden <= 100) {
			this.zufrieden = zufrieden;
		}
	}
	public int getGesund() {
		return gesund;
	}
	public void setGesund(int gesund) {
		if (gesund >= 0 && gesund <= 100 ) {
			this.gesund = gesund;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void fuettern(int anzahl) {
		setHunger(hunger + 10);
	}
	public void schlafen(int dauer) {
		setMuede (muede + 10);
	}
	public void spielen(int dauer) {
		setZufrieden (zufrieden + 10);
	}
	public void heilen() {
		this.gesund = 100;
	}
}
