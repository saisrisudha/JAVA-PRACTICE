import java.util.Scanner;
class weekdays{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a day");
		int day=sc.nextInt();
		if(day==1)
		{
			System.out.println("It's Sunday!");
		}
		else if(day==2)
		{
			System.out.println("It's Monday!");
		}
		else if(day==3)
		{
			System.out.println("It's Tuesday!");
		}
		else if(day==4)
		{
			System.out.println("It's Wednesday!");
		}
		else if(day==5)
		{
			System.out.println("It's Thursday!");
		}
		else if(day==6)
		{
			System.out.println("It's Friday!");
		}
		else if(day==7)
		{
			System.out.println("It's Saturday!");
		}
		else
		{
			System.out.println("Invalid day!");
		}
	}
}