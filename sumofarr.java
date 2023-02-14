import java.util.Scanner;
class sumofarr{
public static void main(String args[])
{
int sum=0,i;
Scanner bs=new Scanner(System.in);
System.out.println("enter the values");
int ns=bs.nextInt();
int arr[]=new int[ns];
System.out.println("enter array");
for(i=0;i<ns;i++)
{
arr[i]=bs.nextInt();
}
System.out.println("array values are:");
for(int dummy:arr)
sum=sum+dummy;
System.out.println(sum);
}
}
