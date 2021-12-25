package com.thoughtfocus.exception.run_time;

public class ArithmeticOperation {
	public int computeDivision(int a,int b) {
		int result =0;
		
		try {
			result = divide(a,b);
			
		}
		
		
		catch(NullPointerException e){
			e.printStackTrace();
		}
	return result;
	}

	int	divide(int a,int b) {
		return a/b;	

}


}
