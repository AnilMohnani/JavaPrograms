package programs;

public class NaturalNumberSumRecursion {

	public static void main(String[] args) {
		int sum=addNumber(3);
		System.out.println(sum);
	}

	public static int addNumber(int num)
	{
		if(num!=0)
		{
			return num+addNumber(num-1);
		}
		else
		return num;
	}

}
