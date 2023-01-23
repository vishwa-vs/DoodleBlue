import java.util.*;
import java.util.logging.*;
public class Calculator implements CalculatorImpl {

	static final Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		log.info("Choose : \n 1 for Add \n 2 for sub \n 3 for Multiplication "
				+ "\n 4 for div \n 5 for SqaureRoot \n 6 for Binomial Number \n "
				+ "7 for Reverse a number \n 8 for Random number");
		
		int choose = sc.nextInt();
		switch(choose) {
		case 1:{
				log.info("Total : "+add.add(add.getvalue()));
				break;
				}
		
		case 2:{
				log.info("Total : "+sub.sub(sub.getvalue()));
				break;
				}
		
		case 3:{
			log.info("Total : "+ mul.mul(mul.getvalue1(), mul.getvalue1()));
			break;
			}
		
		case 4:{	
			log.info("Total : "+(div.div(div.getvalue1(),div.getvalue2())));
			break;
			}
		case 5:{
			log.info("square Root of "+""+sqr.getvalue()+" is : "+(sqr.Sqrt(sqr.getvalue())));
			break;
			}
		
		case 6:{	
			log.info("Binomial number of "+""+bin.getvalue()+" is : "+bin.bino(bin.getvalue()));
			break;
			}
		
		case 7:{
			rev.rev(rev.getvalue());
			break;
			}
		
		case 8:{	
			rand.rdm(rand.getvalue());
			}
		
		default:{
			log.info("Choose the correct value");
			}
		}
	}
		catch(Exception e) {
			log.info("Enter the correct value "+e);
		}
}
}