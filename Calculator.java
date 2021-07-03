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
        while(b == 0.0d)
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
            return Math.sin(Math.toDegrees(getDouble()));
        else if(str == 'rad')
            return Math.sin(getDouble());
        else
            err();
    }

    
    public double cos()
    {
        System.out.println("Do you want to enter the angle in degrees or radians? \'deg\' or \'rad\'");
        str=sc.next();
        if(str == 'deg')
            return Math.cos(Math.toDegrees(getDouble()));
        else if(str == 'rad')
            return Math.cos(getDouble());
        else
            err();
    }

    
    public double tan()
    {
        System.out.println("Do you want to enter the angle in degrees or radians? \'deg\' or \'rad\'");
        str=sc.next();
        if(str == 'deg')
            return Math.tan(Math.toDegrees(getDouble()));
        else if(str == 'rad')
            return Math.tan(getDouble());
        else
            err();
    }
    

    public double csc()
    {
        return 1/sin();
    }
    

    public double sec()
    {
        return 1/cos();
    }
    

    public double cot()
    {
        return 1/tan();
    }

    
    public double ln()
    {
        return Math.log(getDouble());
    }
    

    public double log()
    {
        return Math.log10(getDouble());
    }


    public double sqrt()
    {
        return Math.sqrt(getDouble());
    }


    public double cbrt()
    {
        return Math.cbrt(getDouble());
    }


    public double pow()
    {
        a = getDouble();
        b = getDouble();
        return Math.pow(a,b);
    }


    public double err()
    {
        System.out.println("Invalid Input!");
        flag=False;
        return 0;
    }

    
    public void err(String msg)
    {
        System.out.println(msg);
        flag=False;
        return 0;
    }


    public static void main(String[] args)
    {
        while(flag)
        {
            flag=True;
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Sine\n6. Cosine\n7. Tangent\n8. Cosecant\n9. Secant\n10. Cotangent\n11. Natural Logarithm\n12. Logarithm(Base 10)\n13. Square Root\n14. Cube Root\n15. Power\n21. Exit\n\nEnter Your Choice : ");
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
                    res = ln();
                    break;
                case 12 :
                    res = log();
                    break;
                case 13 :
                    res = sqrt() ;
                    break;
                case 14 :
                    res = cbrt() ;
                    break;
                case 15 :
                    res = pow() ;
                    break;
                case 16 :
                    res =  ;
                    break;
                case 17 :
                    res =  ;
                    break;
                case 18 :
                    res =  ;
                    break;
                case 19 :
                    res =  ;
                    break;
                case 20 :
                    res =  ;
                    break;
                case 21 :
                    flag=false;
                    break;
                default :
                    err();
            }
            if(flag)
                result(res);
        }
    }
}