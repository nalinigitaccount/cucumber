package cucumber;

public class swap {

	public static void main(String[] args) {

		
		int first = 30;
		int second = 50;
		System.out.println("first and second before swap" + "First "+ first + "Second " + second);

		first = first-second;
		second = first + second;
		first = second - first;
		
		System.out.println("first and second after swap" + "First "+ first + "Second " + second);
		System.out.println("first and second after swap" + "First "+ first + "Second " + second);

	}

}
