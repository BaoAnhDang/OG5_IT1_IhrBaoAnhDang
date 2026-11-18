package de.promocode.logic;

public class CodeSearch {

	public static int NOT_FOUND = -1;

	/**
	 * Sucht einen Code in der Liste.
	 * 
	 * @param list
	 *            Liste der Codes im Long-Format
	 * @param searchValue
	 *            Gesuchter Code
	 * @return Index des Codes, wenn er vorhanden ist, NOT_FOUND wenn er nicht
	 *         gefunden werden konnte
	 */
	public static int findPromoCode(long[] list, long searchValue) {
		int low = 0;
		int high = list.length -1;
		
		while(low <= high) {
			int mitte = low + (high - low) / 2;
			
			if (list[mitte] == searchValue) {
				return mitte;
			}
			else if (list[mitte] < searchValue) {
				low = mitte + 1;
			}
			else {
				high = mitte - 1;
			}
		}

		return NOT_FOUND;
	}
}