import java.util.*;
public class calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		addimpl Add = new addimpl();
		subimpl Sub = new subimpl();
		mulimpl Mul = new mulimpl();
		divimpl Div = new divimpl();
		sqrtimpl Sqr = new sqrtimpl();
		binoimpl bin = new binoimpl();
		revimpl Rev = new revimpl();
		rdmimpl rand = new rdmimpl();
		System.out.println("Choose : \n 1 for Add \n 2 for sub \n 3 for Multiplication "
				+ "\n 4 for div \n 5 for SqaureRoot \n 6 for Binomial Number \n 7 for Reverse a number \n 8 for Random number");
		int choose = sc.nextInt();
		switch(choose) {
		case 1:{
			System.out.println("Enter the number of values");
			int n=sc.nextInt();
			int[] value = new int[n] ;
			for(int i=0;i<n;i++) {
				System.out.println("Enter the values to add");
				value[i]=sc.nextInt();}
				System.out.println("Total : "+Add.add(value));
				break;
				}
		case 2:{
			System.out.println("Enter the number of values");
			int n=sc.nextInt();
			int[] value = new int[n] ;
			for(int i=0;i<n;i++) {
				System.out.println("Enter the values to sub");
				value[i]=sc.nextInt();}
				System.out.println("Total : "+Sub.sub(value));
				break;
				}
		case 3:{
			System.out.println("Enter first number : ");
			int val1 = sc.nextInt();
			System.out.println("Enter Second number : ");
			int val2 = sc.nextInt();
			System.out.println("Total : "+ Mul.mul(val1, val2));
			break;
			}
		case 4:{
			System.out.println("Enter first number : ");
			double val1 = sc.nextDouble();
			System.out.println("Enter Second number : ");
			double val2 = sc.nextDouble();
			System.out.println("Total : "+(Div.div(val1,val2)));
			break;
		}
		case 5:{
			System.out.println("Enter the number : ");
			int val1 = sc.nextInt();
			System.out.println("square Root of "+""+val1+" is : "+(Sqr.Sqrt(val1)));
			break;
		}
		case 6:{
			System.out.println("Enter the number : ");
			int val1 = sc.nextInt();
			System.out.println("Binomial number of "+""+val1+" is : "+bin.bino(val1));
			break;
		}
		case 7:{
			System.out.println("Enter the number of values");
			int num = sc.nextInt();
			int[] val= new int[num];
			for(int i=0;i<num;i++) {
			System.out.println("Enter the number : ");
			 val[i] = sc.nextInt();
			}
			Rev.rev(val);
			break;
		}
		case 8:{
			System.out.println("Enter the number : ");
			int num = sc.nextInt();
			rand.rdm(num);
		}
	}
}
}