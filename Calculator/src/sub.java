interface sub {

	int sub(int...num); 
}		
class subimpl implements sub{
	
	public int sub(int... num) {
		int sum = 0;
		for(int i : num) { 	
		sum = i-sum;
		
	}
		return sum;
	
}
}
