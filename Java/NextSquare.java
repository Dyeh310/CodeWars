
public class NextSquare {

	  public static long findNextSquare(long sq) {
		  long counter = 0;
		  boolean running = true;
		  long answer = 0;
		  for (long i = 0; i < sq; i++) {
			  if (i * i == sq) {
				  counter = i;
				  while (running) {
					  counter++;
					  if ((counter * counter) / counter == counter) {
						  answer = counter * counter;
						  running = false;
						  return answer;
					  }
				  }
			  } 
		  }
		  
		  
	      return -1; 
	  }
	
	public static void main(String[] args) {
		System.out.println(findNextSquare(49));

	}

}
