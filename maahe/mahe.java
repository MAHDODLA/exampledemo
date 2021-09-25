import java.util.Scanner;  
class Tax
{
public static void main(String[]args)
{
double tax=0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter monthly salary:");
double sal = sc.nextDouble();
System.out.println();
double asal=12*sal;

if(asal >=1 && asal<=250000)
{
   	 tax=0;
                  System.out.println("Income tax amount is "+tax);
}
else if(asal >=250001 && asal<=500000)
{
	tax=0.1*(asal);
                  System.out.println("Income tax amount is "+tax);
}

else if(asal >=500001 && asal<=1000000)
{
	tax=((0.2*(asal));//+(0.1*250000));
                  System.out.println("Income tax amount is "+tax);
}
else
{
tax=((0.3*(asal));//+(0.2*500000)+(0.1*250000));
System.out.println("Income tax amount is "+tax);
}
//System.out.println("Income tax amount is "+tax);
}
}


