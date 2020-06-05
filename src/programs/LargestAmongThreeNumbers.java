package programs;

public class LargestAmongThreeNumbers {
public static void main(String[] args) {
	
	int x=40,y=40,z=30;
	if (x>y && x>z)
	{
		System.out.println("x greatest");
	}
	else if(y>z)
		System.out.println("y greatest");
	else 
		System.out.println("z greatest");
}
}
