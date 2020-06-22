package programs;


public class pallindromeBuffered {

	public static void main(String[] args) {
String s="MADAM";
StringBuffer str=new StringBuffer(s);
StringBuilder st=new StringBuilder(s);
st.reverse();
StringBuffer rev=str.reverse();
String revString=rev.toString();
if(revString.equalsIgnoreCase(s))
{
	System.out.println("pallindrome");
}else System.out.println("Not pallindrome");

	}

}
