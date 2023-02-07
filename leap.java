import java.util.Scanner;
class leap{
         public static void main(String args[])
        {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter Year");
           int year=sc.nextInt();
           if(year%4==0)
           {
             System.out.println("It is leap year"+year);
            }
          else{
          System.out.println("It is not leap year"+year);
           }
      }
}
