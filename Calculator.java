import java.util.Scanner;
import java.Math.*;

public class Calculator
{
    Scanner sc = new Scanner(System.in);
    int x;
    double a, b, x, res;
    boolean flag=true;
    String str;
    public double getDouble()
    {
        System.out.println("Enter a number :");
        x=sc.nextDouble();
        return x;
    }
    
    public double add()
    {
        a = getDouble();
        b = getDouble();
        return a+b;
    }

    public double sub()
    {
        a = getDouble();
        b = getDouble();
        return a-b;
    }

    public double mul()
    {
        a = getDouble();
        b = getDouble();
        return a*b;
    }

    public double div()
    {
        a = getDouble();
        b = getDouble();
        while(b==0)
        {
            System.out.println("Divisor can not be 0!");
            b = getDouble();
        }
        return a/b;
    }
    
    public double sin()
    {
        System.out.println("Do you want to enter the angle in degrees or radians? \'deg\' or \'rad\'");
        str=sc.next();
        if(str == 'deg')
            return
        else if(str == 'rad')
            return
        else
            err();
    }
    
    public double cos()
    {

    }
    
    public double tan()
    {

    }
    
    public double csc()
    {

    }
    
    public double sec()
    {

    }
    
    public double cot()
    {

    }
    
    public double ln()
    {

    }
    
    public double log()
    {

    }

    public static void main(String[] args)
    {
        while(flag)
        {
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Sine\n6. Cosine\n7. Tangent\n8. Cosecant\n9. Secant\n10. Cotangent\n11. Natural Logarithm\n12. Logarithm(Base 10)\n13.\n. Exit\n\nEnter Your Choice : ");
            x = sc.nextInt();
            switch(x)
            {
                case 1 :
                    res = add();
                    break;
                case 2 :
                    res = sub();
                    break;
                case 3 :
                    res = mul();
                    break;
                case 4 :
                    res = div();
                    break;
                case 5 :
                    res = sin();
                    break;
                case 6 :
                    res = cos();
                    break;
                case 7 :
                    res = tan();
                    break;
                case 8 :
                    res = csc();
                    break;
                case 9 :
                    res = sec();
                    break;
                case 10 :
                    res = cot();
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
                    System.out.println("Invalid Input!");
            }
            result(res);
        }
    }
}