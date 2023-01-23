import java.util.Scanner;
import java.util.logging.Logger;class Mulimpl implements Mul {
	static final Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	Scanner sc= new Scanner(System.in);
	
	int getvalue1() {
	log.info("Enter first number : ");
	int val1 = sc.nextInt();
	return val1;
	}
	int getvalue2() {
	log.info("Enter Second number : ");
	int val2 = sc.nextInt();
	return val2;

}
	public int mul(int num1, int num2) {
		
		return num1*num2;
	}
}
