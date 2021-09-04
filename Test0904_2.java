
import java.util.*;

public class Test0904_2 {
    //合并数组问题，小米笔试题
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String[] munber = sc.nextLine().split(",");
            int m=Integer.parseInt(munber[0].replaceAll("m=",""));
            int n=Integer.parseInt(munber[1].replaceAll("n=",""));
            int[] A=new int[m+n];
            String[] Adata= sc.next().split(",");
            String[] Bdata = sc.next().split(",");
            for(int i=0;i<m;i++){
                A[i]=Integer.parseInt(Adata[i]);
            }
            for(int i=0;i<n;i++){
                A[m+i]=Integer.parseInt(Bdata[i]);
            }
            Arrays.sort(A);
            for(int i=0;i<A.length;i++){
                System.out.print(A[i]);
                if(i!=A.length-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
