import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;
class Rdmimpl implements random{
	Scanner sc= new Scanner(System.in);
	static final Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	int getvalue() {
		log.info("Enter the number : ");
		int num = sc.nextInt();
		return num;
	}
	public void rdm(int num) {
		Random rand = new Random();
		int val = 5;
		for(int i=0;i<val;i++) {
		 System.out.println(rand.nextInt(num));
		 
		}
	}
}