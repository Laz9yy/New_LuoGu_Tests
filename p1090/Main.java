package New_LuoGu_Tests.p1090;
import java.util.Scanner;
import java.util.PriorityQueue;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        PriorityQueue<Integer> heap=new PriorityQueue<>();//创建一个小根堆 自动从小到大排序
        for(int i=0;i<N;i++){
            heap.add(sc.nextInt());
        }
        int sum=0;
        while (heap.size()>1) {
            int num1=heap.poll();
            int num2=heap.poll();
            int t=num1+num2;
            sum+=t;
            heap.add(t);
        }
        System.out.println(sum);
        sc.close();
    }
}
