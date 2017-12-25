

public class Encoder {

	public static String encode(String word) {
		StringBuilder newWord = new StringBuilder(word.toLowerCase());
		for (int i = 0; i < newWord.length() - 1; i++) {
			for (int j = i + 1; j < word.length(); j++) {				
				if (newWord.charAt(i) == newWord.charAt(j)) {
					newWord.setCharAt(i, ')');
					newWord.setCharAt(j, ')');
				}
			}

		}
		for (int i = 0; i < newWord.length(); i++) {
			if (newWord.charAt(i) != ')') {
				newWord.setCharAt(i, '(');
			}
		}
		return newWord.toString();
	}


	public static void main(String[] args) {

		System.out.println(encode("Success"));

	}

}
