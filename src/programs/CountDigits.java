package programs;

public class CountDigits {

	public static void main(String[] args) {
int num=12563;
int i=0;
int count=0;
while(num!=0)
{
	num=num/10;
	count++;

}
System.out.println(count);

}
}