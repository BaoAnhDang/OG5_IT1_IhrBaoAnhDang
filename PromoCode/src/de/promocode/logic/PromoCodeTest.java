package de.promocode.logic;

public class PromoCodeTest {

	public static void main(String[] args) {
		long[] nummer = {1,3,8,16,33,52,89,107};
		System.out.println(CodeSearch.findPromoCode(nummer, 8));
	}

}
