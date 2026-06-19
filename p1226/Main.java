package New_LuoGu_Tests.p1226;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextInt();
        long b=sc.nextInt();
        long p=sc.nextInt();
        long result=fastCompute(a, b, p);
        System.out.printf("%d^%d mod %d=%d",a,b,p,result);
        sc.close();
    }
    public static long fastCompute(long a,long b,long p){
        long result=1;
        a%=p;
        while(b>0){
            if(b%2==1){
                result=(result*a)%p;
            }
            a=a*a%p;
            b/=2;
        }
        return result;
    }
}