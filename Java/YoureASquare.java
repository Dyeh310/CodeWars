//Prints a perfect square
public class Square {    
    public static boolean isSquare(int n) {        
       		if (n < 0) {
			System.out.println("negative numbers aren't square numbers");
			return false;
		}
		for (long i = 0; i <= n; i++) {
			
			if (i * i == n) {
				System.out.println(n + " is a square number");
				return true;
			}
		}
		System.out.println(n + " isn't a square number");
		return false;

	} 
    }
