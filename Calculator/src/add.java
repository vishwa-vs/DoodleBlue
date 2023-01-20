
interface add{
	int add(int...num);
	
	}
class addimpl implements add{
	
	public int add(int... num) {
		int sum = 0;
		for(int i : num) {	
		sum = sum+i;
		
	}
		return sum;
	
}
}


