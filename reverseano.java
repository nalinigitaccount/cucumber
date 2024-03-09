package cucumber;

public class reverseano {

	public static void main(String[] args) {
		
		int no = 321;
		int rev = 0;
		while (no > 0)
		{
			rev = rev * 10;
			System.out.println(rev);
			rev = rev + (no%10);
			System.out.println(no);
			no = no / 10;
			System.out.println(no);
		}
		System.out.println(rev);

	}

}
