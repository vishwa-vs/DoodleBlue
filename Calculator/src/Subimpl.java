import java.util.logging.Logger;

import java.util.Scanner;
import java.util.logging.Logger;

class Subimpl implements Sub{
	static final Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	int[] getvalue() {
		Scanner sc= new Scanner(System.in);
		log.info("Enter the number of values");
		int n=sc.nextInt();
		int[] value = new int[n] ;
		for(int i=0;i<n;i++) {
			log.info("Enter the values to sub");
			value[i]=sc.nextInt();}
		return value;
	}
	public int sub(int... num) {
		int sum = 0;
		for(int i : num) { 	
		sum = i-sum;
		
	}
		return sum;
	
}
}
