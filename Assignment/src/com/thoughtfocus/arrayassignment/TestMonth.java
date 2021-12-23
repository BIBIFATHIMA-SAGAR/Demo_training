package com.thoughtfocus.arrayassignment;

public class TestMonth {
	public static void main(String[] args) {
		Months months = new Months();
		months.save("Jan");
		months.save("Feb");
		months.save("Mar");
		months.save("Apr");
		months.save("May");
		months.save("Jun");
		months.save("Jul");
		months.save("Aug");
		months.save("Sep");
		months.save("Oct");
		months.save("Nov");
		months.save("Dec");
//		months.save("Dec");

		
		months.printAll();
		String response = months.delete("Mar");
		System.out.println(response);
		months.printAll();
		
		
		
		
	}

}
