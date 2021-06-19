import java.util.Scanner;
import java.Math.*;

public class Calculator
{
    
    public void result(float a, float b, double res)
        System.out.println("Result "+ res+"\n\n")

    public static void main(String[] args)
    {
        int x;
        float a, b;
        double result;
        Scanner sc = new Scanner(System.in);
        boolean flag=true;
        while(flag)
        {
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Sine\n6. Cosine\n7. Tangent\n8. Cosecant\n9. Secant\n10. Cotangent\n11. Natural Logarithm\n12. Logarithm(Base 10)\n13.\n. Exit\n\nEnter Your Choice : ");
            ch = sc.nextInt();
            System.out.print("Enter Two Numbers : ");
            a = sc.nextFloat();
            b = sc.nextFloat();
            switch(x)
            {
                case 1 :
                    res = a + b;
                    break;
                case 2 :
                    res = a - b;
                    break;
                case 3 :
                    res = a * b;
                    break;
                case 4 :
                    res = a / b;
                    break;
                case 5 :
                    res =  ;
                    break;
                case 6 :
                    res =  ;
                    break;
                case 7 :
                    res =  ;
                    break;
                case 8 :
                    res =  ;
                    break;
                case 9 :
                    res =  ;
                    break;
                case 10 :
                    res =  ;
                    break;
                case 11 :
                    res =  ;
                    break;
                case 12 :
                    res =  ;
                    break;
                case 13 :
                    res =  ;
                    break;
                case 14 :
                    res =  ;
                    break;
                case 15 :
                    res =  ;
                    break;
                case 16 :
                    res =  ;
                    break;
                case 17 :
                    flag=false;
                    break;
                default :
                    System.out.print("Invalid Input!");
            }
            result(res);
        }
    }
}