interface Binomial {
     	int bino(int num);
}

class binoimpl implements Binomial{

	public int bino(int num) {
		int temp=1;
		for(int i=1;i<=num;i++) {
			temp =temp*i; 
		}
		return temp;
	}
	
}