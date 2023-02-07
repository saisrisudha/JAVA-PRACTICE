import java.util.Scanner;
class greatest
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
               System.out.println("enter the num1");
         int num1=sc.nextInt();
               System.out.println("enter the num2");
         int num2=sc.nextInt();
               System.out.println("enter the num3");
         int num3=sc.nextInt();
int grtnum=(num1>num2?num1:num2)>num3?(num1>num2?num1:num2):num3;
               System.out.println("The greatest number is:" +grtnum);
         }
}


           