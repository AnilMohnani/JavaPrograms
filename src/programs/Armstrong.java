package programs;

public class Armstrong {

	public static void main(String[] args) {
		int num=153;
		int actual=num;
		int rem;
		int sum=0;
		
		while(num!=0)
		{
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(sum==actual)
		{
			System.out.println("Armstrong");
		}
		else System.out.println("Not Armstrong");
	}

}
