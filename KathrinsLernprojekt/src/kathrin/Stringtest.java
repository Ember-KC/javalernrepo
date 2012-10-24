package kathrin;

public class Stringtest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = new String("Das war wie ein Atomkraftwerk.");
		String teilstr = "Atom";
		searchWord(str, teilstr);

	}

	public static void searchWord(String str, String teilstr) {
		if (str.contains(teilstr)) {
			System.out.println("Das Wort " + teilstr + " ist enthalten!");
			System.out.println("Das Wort beginnt an Stelle "
					+ (str.indexOf(teilstr) + 1));
			System.out.println(str.substring(1, 7));
			String str1 = str.replace("a", "u");
			System.out.println(str1);
			String str2 = str1.substring(17, str.length());
			System.out.println(str2);

		} else {
			System.out.println("Das Wort " + teilstr + " ist nicht enthalten!");
		}

	}

}
