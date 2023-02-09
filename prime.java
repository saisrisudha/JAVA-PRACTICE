import java.util.Scanner;
class prime{
public static void main(String args[])
{
Scanner ns=new Scanner(System.in);
System.out.println("enter the number");
int n=ns.nextInt();
int fact=0;
for( int i=1;i<=n;i++)
{
if(n%i==0)
{
fact++;
}
}
if(fact==2)
{
System.out.println("prime"+n);
}
else{
System.out.println("not prime"+n);
}
}
}