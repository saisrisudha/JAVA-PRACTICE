import java.util.Scanner;
class great
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
               System.out.println("enter the num1");
         int num1=sc.nextInt();
               System.out.println("enter the num2");
         int num2=sc.nextInt();
         int gretnum=num1>num2?num1:num2;
               System.out.println("Greatest number is:"+gretnum);
         }
}


           