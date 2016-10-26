
public class FindIt {
	public static void main(String[] args) {

		int suma = 0;
		String fromONEtoNINE = "OneTwoThreeFourFiveSixSevenEightNine";
		String fromTENtoNINETEEN = "TenElevenTwelveThirteenFourteenFifteenSixteenSeventeenEighteenNineteen";
		String dozens = "TwentyThirtyFortyFiftySixtySeventyEightyNinety";
		String hundred = "Hundred";
		String thousand = "thousand";
		String and = "and";

		suma += 90 * fromONEtoNINE.length() + 10 * fromTENtoNINETEEN.length() + 100 * dozens.length()
				+ 900 * hundred.length() + 891 * and.length() + 100 * fromONEtoNINE.length() + thousand.length()
				+ and.length();

		System.out.println(suma);

	}
}
