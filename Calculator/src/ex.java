interface ex {

	int sub(int...num); 
}		
class eximpl implements ex{
	
	public int sub(int... num) {
		int sum = 0;
		for(int i : num) {	
		sum = sum+i;
		
	}
		return sum;
	
}
}
