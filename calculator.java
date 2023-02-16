import java.util.Scanner;
class calculator{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt(); //taking first parameter from user
        System.out.println("Enter second number");
        int num2=sc.nextInt(); //taking second parameter from user
        calculator ops=new calculator();
        int addition=ops.add(num1,num2); //method call vth parameters
        int subtraction=ops.sub(num1,num2); //method call vth parameters
        int multiplication=ops.mul(num1,num2); //method call vth parameters
        int division=ops.div(num1,num2);//method call vth parameters
        System.out.println("The addition of "+num1+" and "+num2+" is: "+addition); // addition we r printing
        System.out.println("The subtraction of "+num1+" and "+num2+" is: "+subtraction); // subtraction we r printing
        System.out.println("The multiplication of "+num1+" and "+num2+" is: "+multiplication); // multiplication we r printing
        System.out.println("The division of "+num1+" and "+num2+" is: "+division); // division we r printing

    }
    public int add(int num1,int num2){
        return num1+num2; //addition is the operation
    }
    public int sub(int num1,int num2){
        return num1-num2; //subtraction is the operation
    }
    public int mul(int num1,int num2){
        return num1*num2; //multiplication is the operation
    }
    public int div(int num1,int num2){
        return num1/num2; //division is the operation
    }
}