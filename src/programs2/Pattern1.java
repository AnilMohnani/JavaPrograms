package programs2;

public class Pattern1 {
public static void main(String[] args) {
	int i=0,j=1,k=1;
	for(i=1;i<=4;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(k);
			System.out.print("\t");

			k++;
		}
		System.out.println("");
	}
	
}
}

/*1
2 3
4 5 6
7 8 9 10
*/