import java.util.Scanner;

public class Solusion {
    //青蛙跳街问题
    public int jumpFloorII(int target) {
        if(target==1){
            return 1;
        }
        int sum=0;
        for(int i=target-1;i>0;i--){
            sum+=jumpFloorII(i);
        }
        return sum+1;

    }

    public static void main(String[] args) {
        
    }



}
