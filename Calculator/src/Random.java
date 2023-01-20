import java.util.Random;
interface random {
		void rdm(int num);
}
class rdmimpl implements random{
	public void rdm(int num) {
		Random rand = new Random();
		int val = 5;
		for(int i=0;i<val;i++) {
		 System.out.println(rand.nextInt(num));
		 
		}
	}
}