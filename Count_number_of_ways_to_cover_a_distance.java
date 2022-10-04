import java.util.Scanner;
import java.lang.Math;
class cd
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
	  int[] arr=new int[100];
        int n=in.nextInt();
        if(n<=2) System.out.print(n);
        else{
        int a=1,b=1,c=2,d=0;
        for(int i=3;i<=n;i++){
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
        System.out.println(d);
    }
    }
}