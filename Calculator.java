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
        System.out.println("Do you want to enter the angle in degrees or radians? \'deg\' or \'rad\'");
        str=sc.next();
        if(str == 'deg')
            return ;
        else if(str == 'rad')
            return ;
        else
            err();
    }
    
    public double sec()
    {
        System.out.println("Do you want to enter the angle in degrees or radians? \'deg\' or \'rad\'");
        str=sc.next();
        if(str == 'deg')
            return ;
        else if(str == 'rad')
            return ;
        else
            err();
    }
    
    public double cot()
    {
        System.out.println("Do you want to enter the angle in degrees or radians? \'deg\' or \'rad\'");
        str=sc.next();
        if(str == 'deg')
            return ;
        else if(str == 'rad')
            return ;
        else
            err();
    }
    
    public double ln()
    {
        return Math.log(getDouble());
    }
    
    public double log()
    {
        return Math.log10(getDouble());
    }

    publid void err()
    {

    }

    public void err(String msg)
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
                    res = ln();
                    break;
                case 12 :
                    res = log();
                    break;
                // case  :
                //     res =  ;
                //     break;
                // case  :
                //     res =  ;
                //     break;
                // case  :
                //     res =  ;
                //     break;
                // case  :
                //     res =  ;
                //     break;
                case 13 :
                    flag=false;
                    break;
                default :
                    err();
            }
            result(res);
        }
    }
}
