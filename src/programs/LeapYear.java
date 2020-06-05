package programs;

public class LeapYear {

	public static void main(String[] args) {

		
		int year=2001;
		boolean leap=false;
		
		if(year%4==0)
		{
			if(year%100==0) // verification if it is century year
			{
				if(year%400==0) //verification if century is leap or not
				{
					leap=true;
				}
				else leap=false;
			}
			else leap=true;
		}
		else leap=false;
	
	if(leap)
		{
		System.out.println("Year " +year+ "is leap year");
		}else System.out.println("Not a leap year");
		
		}}

