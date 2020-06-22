package programs2;

public class SmallestNumberIn2D {
public static void main(String[] args) {
	int arr[][]= {{25,6,7},{45,17,3},{90,8,56}};
	int min=arr[0][0];
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(arr[i][j]<min)
			{
				min=arr[i][j];
			}
		}
	}
	System.out.println(min);
	
}
}
