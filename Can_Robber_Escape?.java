import java.util.Scanner;
import java.lang.Math;
class cd
{
    public static void main(String[] args)
    {
        int[] arr=new int[100];
        int c=0,n;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0) c+=1;
        }
        if(c<3) System.out.println("YES");
        else System.out.println("NO");
    }
}