import java.util.StringTokenizer;

class TokenTester {
	
	public static void main (String[] args) {
	
	String date = "10/17/1991";
	System.out.println(date);
	
	StringTokenizer st1;
	
	st1 = new StringTokenizer(date, "/");
	System.out.println("Token 1: " + st1.nextToken());
	System.out.println("Token 2: " + st1.nextToken());
	System.out.println("Token 3: " + st1.nextToken());
	
	}
}