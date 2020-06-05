package programs;

public class ArmstrongInterval {

	public static void main(String[] args) {
		
		int num;
		int rem;
		int sum=0;
		for(int i=1;i<=154;i++)
		{
			num=i;

			while(num!=0)
		{
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(sum==i)
		{
			System.out.println(i);
		}
		sum=0;
	
		}
		}

}
