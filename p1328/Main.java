package New_LuoGu_Tests.p1328;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int NA=sc.nextInt();
        int NB=sc.nextInt();
        int[] source_A=new int[NA];
        int[] source_B=new int[NB];
        for(int i=0;i<NA;i++){
            source_A[i]=sc.nextInt();
        }
        for(int i=0;i<NB;i++){
            source_B[i]=sc.nextInt();
        }
        int[][] result={{0,-1,1,1,-1},{1,0,-1,1,-1},{-1,1,0,-1,1},{-1,-1,1,0,1},{1,1,-1,-1,0}};
        int result_A=0,result_B=0;
        int record_A=0,record_B=0;
        for(int i=0;i<N;i++){
            if(record_A==NA)record_A=0;
            if(record_B==NB)record_B=0;
            int temp_X=source_A[record_A];
            int temp_Y=source_B[record_B];
            if(result[temp_Y][temp_X]==1)result_B++;
            if (result[temp_Y][temp_X]==-1)result_A++;
            record_A++;
            record_B++;  
        }
        System.out.printf("%d %d",result_A,result_B);
        sc.close();
    }
}
