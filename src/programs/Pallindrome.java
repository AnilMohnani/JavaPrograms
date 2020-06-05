package programs;

public class Pallindrome {

	public static void main(String[] args) {
		int num = 525;
		int reverse = num;
		int rev = 0;
		int rem;
while(num!=0)
{
		rem = num % 10;
		rev = rev * 10 + rem;
		num = num / 10;
}
System.out.println(rev);
		if (reverse == rev) {
			System.out.println("Pallindrome");
		} else
			System.out.println("Not pallindrome");
	}

}
