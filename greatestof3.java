import java.util.Scanner;
class greatest{
               public static void main(String args[])
               {
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter value");
                int num1=sc.nextInt();
               System.out.println("Enter second value");
              int num2=sc.nextInt();
              System.out.println("Enter third value");
              int num3=sc.nextInt();
             if(num1>num2)
            {
          if(num1>num3)
           {
              System.out.println(num1+"is great");
           }
             else{
                           System.out.println(num3+"is great");
                      }
              }
          else{
                   if(num2>num3)
                     {
                         System.out.println(num2+"is great");
                          }
                    else{
                         System.out.println(num3+"is great");
                    }
              }
        }
}
