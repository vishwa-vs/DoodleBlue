
interface Reverse {
		void rev(int num[]);
}
class revimpl implements Reverse{
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