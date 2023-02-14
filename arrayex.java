import java.util.Scanner;
class arrayex{
public static void main(String args[])
{
Scanner bs=new Scanner(System.in);
System.out.println("enter the values");
int ns=bs.nextInt();
int arr[]=new int[ns];
System.out.println("enter array");
for(int i=0;i<ns;i++)
{
arr[i]=bs.nextInt();
}
System.out.println("array values are:");
for(int dummy:arr)
System.out.println(dummy);
}
}
