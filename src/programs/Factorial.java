package programs;

public class Factorial {

	public static void main(String[] args) {
int num=0;
int fact=1;
if(num>=1) {
for(int i=1;i<=num;i++)
{
	fact=fact*i;
}
System.out.println(" factorial is "+ fact);
	}else System.out.println(1);

}
}
