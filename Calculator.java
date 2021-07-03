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
    

    public double sine()
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

    
    public double cosine()
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

    
    public double tangent()
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


    public double cosecant()
    {
        return 1/sin();
    }
    

    public double secant()
    {
        return 1/cos();
    }
    

    public double cotangent()
    {
        return 1/tan();
    }


    public double arcsine()
    {
        return Math.asin(getDouble());
    }

    
    public double arccosine()
    {
        return Math.acos(getDouble());
    }

    
    public double arctangent()
    {
        return Math.atan(getDouble());
    }


    public double ln()
    {
        return Math.log(getDouble());
    }
    

    public double log()
    {
        return Math.log10(getDouble());
    }


    public double sqroot()
    {
        return Math.sqrt(getDouble());
    }


    public double cubert()
    {
        return Math.cbrt(getDouble());
    }


    public double power()
    {
        a = getDouble();
        b = getDouble();
        return Math.pow(a,b);
    }


    public double absolute()
    {
        a = getDouble();
        return Math.abs();
    }


    public int modulus()
    {
        a = getDouble();
        b = getDouble();
        return a%b;
    }


    public int flo()
    {
        a = getDouble();
        return Math.floor(a);
    }


    public int cei()
    {
        a = getDouble();
        return Math.ceil(a);
    }


    public void rand()
    {
        return Math.random()
    }


    public void err(String msg)
    {
        System.out.println(msg);
        flag=False;
    }


    public static void main(String[] args)
    {
        while(flag)
        {
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Sine\n6. Cosine\n7. Tangent\n8. Cosecant\n9. Secant\n10. Cotangent\n11. Arcsine\n12. Arccotangent\n13. Arctangent\n14. Natural Logarithm\n15. Logarithm(Base 10)\n16. Square Root\n17. Cube Root\n18. Power\n19. Absolute\n20. Modulus\n21. Floor\n22. Ceil\n23. Random\n24. Exit\n\nEnter Your Choice : ");
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
                    res = sine();
                    break;
                case 6 :
                    res = cosine();
                    break;
                case 7 :
                    res = tangent();
                    break;
                case 8 :
                    res = cosecant();
                    break;
                case 9 :
                    res = secant();
                    break;
                case 10 :
                    res = cotangent();
                    break;
                case 11 :
                    res = asine();
                    break;
                case 12 :
                    res = arccosine();
                    break;
                case 13 :
                    res = arctangent();
                    break;
                case 14 :
                    res = ln();
                    break;
                case 15 :
                    res = log();
                    break;
                case 16 :
                    res = sqroot();
                    break;
                case 17 :
                    res = cbroot();
                    break;
                case 18 :
                    res = power();
                    break;
                case 19 :
                    res = absolute();
                    break;
                case 20 :
                    res = modulus();
                    break;
                case 21 :
                    res = flo();
                    break;
                case 22 :
                    res = cei();
                    break;
                case 23 :
                    res = rand();
                    break;
                case 24 :
                    flag=false;
                    break;
                default :
                    err("Invalid Input");
            }
            if(flag)
                result(res);
        }
    }
}