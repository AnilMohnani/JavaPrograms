package programs;

public class CheckPrimeAsSumOfPrime {

	public static void main(String[] args) {
boolean flag=false;
		int num=9;
		for(int i=2;i<num/2;i++)
		{
			if(CheckPrimeAsSumOfPrime.checkPrime(i))
			{
				if(CheckPrimeAsSumOfPrime.checkPrime(num-i))
				{
					System.out.println(+num+ "=" +i + "+" +(num-i));
					flag=true;
				}
			}
		
		
		}
		if(!flag)
		{
			System.out.println("Not possible to express");
		}
		
		
	}

	public static boolean checkPrime(int n) {

		int count = 2;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				++count;
			}
		}
		if (count == 2) {
			return true;
		} else {
			return false;
		}

	}
}
