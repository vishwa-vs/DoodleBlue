import java.util.Scanner;
import java.util.logging.Logger;

class Binoimpl implements Binomial{
	Scanner sc= new Scanner(System.in);
	
	static final Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	int getvalue() {
		log.info("Enter the number : ");
		int val1 = sc.nextInt();
		return val1;
	}

	public int bino(int num) {
 		int temp=1;
		for(int i=1;i<=num;i++) {
			temp =temp*i; 
		}
		return temp;
	}
	
}