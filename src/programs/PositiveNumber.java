package programs;

import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Double Number");
		double d=sc.nextDouble();
		if(d<0.0)
		{
			System.out.println("Negative");
		}else
		if(d>0.0)
		{
			System.out.println("Positive");
		}
		else System.out.println("Zero");
	}

}
