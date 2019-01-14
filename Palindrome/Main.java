public class Main {

	public static void main(String[] args) {
		String[] fwd = {"Palindrome", "Civic", "Radar", "Level", "Eva, can I stab bats in a cave?", "A man, a plan, a canal, Panama", "Mr. Owl ate my metal worm", "Never odd or even", "Doc, Note: I Dissent. A fast never prevents a fatness. I diet on cod."};
		for (int i = 0; i < fwd.length; i++){
			boolean test = compare(fwd[i]);
			if (test)
				System.out.printf("\n\"%s\" is a palindrome.", fwd[i]);
			else
				System.out.printf("\n\"%s\" isn't a palindrome.", fwd[i]);
		}
	}

	public static String punctuationEradicator(String fwd) {
		String rev = "";

		for (int i = 0; i < fwd.length(); i++) {
			if ((fwd.charAt(i) == ' ')|| (fwd.charAt(i) == ',') ||(fwd.charAt(i)==('.')) || (fwd.charAt(i)) == (':') || (fwd.charAt(i)) == ('?')) {
				rev = rev;
			}
			else rev += fwd.charAt(i);
		}
		return rev;
	}

	public static boolean compare(String fwd){
		fwd = punctuationEradicator(fwd);
		String fin = "";
		int len = fwd.length() - 1;
		for (int i = 0; i < fwd.length(); i ++){
			fin += fwd.charAt(len - i);
		}
		return fwd.equalsIgnoreCase(fin);
	}
}
