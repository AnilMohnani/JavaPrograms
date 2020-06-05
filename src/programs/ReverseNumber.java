package programs;

public class ReverseNumber {
	public static void main(String[] args) {
		
		int num=3456;
		int rem;
		int rev = 0;
		
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
		System.out.println("------------------------");
		int a=567;
		String n=Integer.toString(a);
		for(int i=n.length()-1;i>=0;i--) {
		System.out.print(n.charAt(i));
	}
	}
}
