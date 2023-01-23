import java.util.Scanner;
import java.util.logging.Logger;
class Revimpl implements Reverse{
	Scanner sc= new Scanner(System.in);
	static final Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	int[] getvalue() {
		log.info("Enter the number of values");
		int num = sc.nextInt();
		int[] val= new int[num];
		for(int i=0;i<num;i++) {
			log.info("Enter the number : ");
		 val[i] = sc.nextInt();
		}
		return val;
	}
	
	public void rev(int num[]) {
		int j=0;
		int[] temp = new int[num.length];
		for(int i=num.length-1;i>=0;i--) {
			temp[j]=num[i];
			j++;
			}
		System.out.print("Reversed number for  ");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]);
		}
		System.out.print(" is : ");
			for(int i=0;i<temp.length;i++) {
				System.out.print(temp[i]);
			}
	}
	
}