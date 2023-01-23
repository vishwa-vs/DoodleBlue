import java.util.Scanner;
import java.util.logging.Logger;
class Divimpl implements Div{
	static final Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	Scanner sc= new Scanner(System.in);
	double getvalue1() {
		log.info("Enter first number : ");
		double val1 = sc.nextDouble();
		return val1;

	}
	double getvalue2() throws Exceptione {
		log.info("Enter Second number : ");
		double val2 = sc.nextDouble();
		if(val2==0)
				throw new Exceptione("Can not divide by a zero");
		return val2;
	}
	
	public double div(double num1,double num2) {
		return num1/num2;
	}
}
