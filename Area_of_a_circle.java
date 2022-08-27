import java.util.Scanner;
import java.lang.Math;
class cd
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double a=in.nextInt();
        double d=3.14*a*a;
        System.out.println(String.format("%.2f",d));
    }
}