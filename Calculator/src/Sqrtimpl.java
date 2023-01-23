import java.util.Scanner;
import java.util.logging.Logger;
class Sqrtimpl implements Sqrt{
	static final Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	int getvalue() {
		Scanner sc= new Scanner(System.in);
		log.info("Enter the number : ");
		int val1 = sc.nextInt();
		return val1;
	}
	public double Sqrt(int num) {
		return Math.sqrt(num);
	}
}