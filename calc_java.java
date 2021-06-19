//Calculator designed by #MadhuvSharma of #Class9A
import java.util.Scanner;
public class Calculator__Superrrr__Confidential__Data
{
    public static void main(String[] args)
    {
        float a, b, result;
        char choice, ch;
        Scanner sc = new Scanner(System.in);
        boolean flag=true;
        while(flag==true)
        {
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit\n\nEnter Your Choice : ");
            choice = sc.next().charAt(0);
            switch(choice)
            {
                case '1' : System.out.print("Enter Two Numbers : ");
                a = sc.nextFloat();
                b = sc.nextFloat();
                result = a + b;
                System.out.print("Result = " + result);
                break;
                case '2' : System.out.print("Enter Two Numbers : ");
                a = sc.nextFloat();
                b = sc.nextFloat();
                result = a - b;
                System.out.print("Result = " + result);
                break;
                case '3' : System.out.print("Enter Two Numbers : ");
                a = sc.nextFloat();
                b = sc.nextFloat();
                result = a * b;
                System.out.print("Result = " + result);
                break;
                case '4' : System.out.print("Enter Two Numbers : ");
                a = sc.nextFloat();
                b = sc.nextFloat();
                result = a / b;
                System.out.print("Result = " + result);
                break;
                case '5' : System.exit(0);
                break;
                default :
                System.out.print("Wrong Choice!");
            }
        }
    }
}