import java.util.Scanner;
import java.lang.Math;
class cd
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double  a=in.nextInt();
        double  b=in.nextInt();
        double d=(a+b)/2;
        System.out.println(String.format("%.4f",d));
    }
}