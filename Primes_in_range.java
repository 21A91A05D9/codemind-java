import java.util.Scanner;
import java.lang.Math;
class cd
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
	    int a=in.nextInt();
        int b=in.nextInt();
        int c=0;
        int[] primes=new int[1000000];
        for(int i=0;i<1000000;i++) primes[i]=1;
        primes[0]=primes[1]=0;
        for(int i=2;i*i<=1000000;i++){
            if(primes[i]==1){
            for(int j=2*i;j<1000000;j+=i){
                if(primes[j]==1) primes[j]=0;
            }
        }
        }
        for(int i=a;i<=b;i++){
            if(primes[i]==1) c+=1;
        }
        System.out.println(c);
    }
}