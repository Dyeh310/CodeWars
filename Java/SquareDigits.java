public class SquareDigits {

	public static int squareDigits(int n) {
		StringBuilder builder = new StringBuilder();
		int j = 0;
		String number = String.valueOf(n);
		for (int i = 0; i < number.length(); i++) {
			j = Character.digit(number.charAt(i), 10);
			int x = j*j;
			builder.append(x);
			
		}
		String answer = builder.toString();
		return Integer.parseInt(answer);
		  
	}

	public static void main(String[] args) {

		System.out.println(squareDigits(2001));
	}

}
