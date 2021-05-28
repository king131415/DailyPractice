package javaDailyProctice.Test0528;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test0528_2 {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
       int[] arr={1,2,3,4};
    }
    public List<List<Integer>> generate(int numRows) {
        if (numRows <= 0) {
            // 直接返回一个空的 List
            return new ArrayList<>();
        }
        // result 用来表示最终结果, 这个 result 中就包含了若干行
        List<List<Integer>> result = new ArrayList<>();
        // 处理第 1 行, 就是固定的一个 1
        List<Integer> firstLine = new ArrayList<>();
        firstLine.add(1);
        result.add(firstLine);
        if (numRows == 1) {
            // 参数为 1 的时候, 返回结果:
            // [
            //   [1]
            // ]
            return result;
        }
        // 处理第 2 行, 就是固定的两个 1
        List<Integer> secondLine = new ArrayList<>();
        secondLine.add(1);
        secondLine.add(1);
        result.add(secondLine);
        if (numRows == 2) {
            return result;
        }
        // 3. 处理后续第 i 行的情况了
        //  a) 每一行的第一个元素和最后一个元素, 都是 1
        //  b) 每一行的列数都是和行数相同
        //  c) i, j => i-1,j-1 + i-1,j
        for (int row = 3; row <= numRows; row++) {
            // 当前行是 row, 上一行就是 row - 1.
            // 此处的 row 是从 1 开始计算的. 而 List 下标是从 0 开始算的. 还需要再 - 1
            // 不建议写成 row - 2
            List<Integer> prevLine = result.get(row - 1 - 1);
            List<Integer> currentLine = new ArrayList<>();
            currentLine.add(1); // 第一列
            // 处理中间的这些列
            for (int col = 2; col <= row - 1; col++) {
                // 这个循环中需要依赖上一行的数据
                // 获取到上一行的两个对应元素
                int num1 = prevLine.get(col - 1);  // 获取到 row-1,col  只不过需要把 col 转成下标, 还需要 -1
                int num2 = prevLine.get(col - 1 - 1); // 获取到 row-1, col-1, 也需要把 col 转成下标, 也要再 - 1
                currentLine.add(num1 + num2);
            }
            currentLine.add(1); // 最后一列
            // 把当前行, 放到最终的结果中
            result.add(currentLine);
        }
        return result;
    }
}
