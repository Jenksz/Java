class JavaJoe {

public static void main(String[] args) {

	// declare global variables
	double Money = 200;
	int count = 1;
	String day = "";
	
	// while loop, if count is less than 8 we are still in the week, if greater then we are past Sunday
	while (count < 8) {
	
	//begin conditional branching
	if (count == 1) {
		day = "Monday";
		double shoeCost = 30 * 1.15;
		Money = Money - shoeCost;
		System.out.println("It is " + day + " and Joe paid " + shoeCost + " for his shoes and has " + Money + " remaining. \n");
		count = count + 1;
	}
	
	if (count == 2) {
		day = "Tuesday";
		int ceilingArea = 12 * 7;
		System.out.println("It is " + day + " and Joe's ceiling has an area of " + ceilingArea + " meters squared. \n");
		count = count + 1;
	}
	
	if (count == 3) {
		day = "Wednesday";
		double paintCost = 1.13 * 84;
		Money = Money - paintCost;
		System.out.println ("It is " + day + ". Joe paid " + paintCost + " for the paint and has " + Money + " remaining. \n");
		count = count + 1;
	}
	
	if (count == 4) {
		day = "Thursday";
		Money = Money - 36.40;
		double gasCost = 36.40;
		double gasAmount = 36.40/0.45;
		System.out.println("It is " + day + " and Joe has spent " + gasCost + " on gas, has " + Money + " remaining, and used " + gasAmount + " litres. \n");
		count = count + 1;
	}
	
	// Nothing happens on Friday but we must count it regardless, could also have been done by increasing count by 2 on Thursday
	if (count == 5){
		count = count + 1;
	}
	
	if (count == 6) {
		day = "Saturday";
		Money = Money - 23;
		System.out.println("It is " + day + " and Joe has " + Money + " remaining. \n");
		count = count + 1;
	}
	
	// Are only 7 possibilities for the week, when 6th has run its course we can use an else statement
	else {
		day = "Sunday";
		System.out.println("It is " + day  + ".\n");
		count = count + 1;
		
	}
	
	// Count is now 8, while loop exits, print statement informing user program is complete
}
	System.out.println("JavaJoe is finished! Goodbye!");
}

}