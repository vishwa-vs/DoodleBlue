import java.util.Scanner;
import java.util.logging.Logger;

class Addimpl implements Add{
	static final Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	int[] getvalue() {
	Scanner sc= new Scanner(System.in);
	log.info("Enter the number of values");
	int n=sc.nextInt();
	int[] value = new int[n] ; 
	for(int i=0;i<n;i++) {
		log.info("Enter the values to add");
		value[i]=sc.nextInt();}
	return value;
	}
	public int add(int... num) {
		int sum = 0;
		for(int i : num) {	
		sum = sum+i;
		
	}
		return sum;
	
}
}