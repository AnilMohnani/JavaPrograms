package programs;

public class PallindromeString {

	public static void main(String[] args) {
		String s="sasu";
		String rev="";
for(int i=s.length()-1;i>=0;i--)
{
rev=rev+s.charAt(i);

}
if(rev.equalsIgnoreCase(s))
{
	System.out.println("pallindsrome");
	}else System.out.println("not pallindrome");

}
}
