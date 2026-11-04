package primzahl;

public class Primzahlen {
	boolean isPrim(long zahl) {
		if (zahl <= 1)
			return false;
		for (int i = 2; i < zahl; i++)
			if (zahl % i != 0)
				return false;
		return true;
	}
}