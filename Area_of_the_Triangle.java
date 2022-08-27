import java.util.Scanner;
import java.lang.Math;
class cd
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double a=in.nextInt();
        double b=in.nextInt();
        double c=in.nextInt();
        double s=(a+b+c)/2;
        double d=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(String.format("%.02f",d));
    }
}