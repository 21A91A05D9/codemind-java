import java.util.Scanner;
import java.lang.Math;
class cd
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
	int n=in.nextInt();
	if(n<=2){
	    System.out.print("The pattern is not possible");
	}
	else{
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n-1;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
    }
}