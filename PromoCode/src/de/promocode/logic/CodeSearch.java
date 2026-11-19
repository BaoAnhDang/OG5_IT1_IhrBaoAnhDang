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
		int a = 0;
		int b = list.length - 1;

		while(a <= b) {
			int mitte = a + (b - a) / 2;

			if (list[mitte] == searchValue) {
				return mitte;
			} else if (list[mitte] < searchValue) {
				a = mitte + 1;
			} else {
				b = mitte - 1;
			}
		}

		return NOT_FOUND;
	}
	public static void main(String[] args) {
		long list[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(findPromoCode(list, 5));
	}
}
