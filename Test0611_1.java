package javaDailyProctice.Test0611;

public class Test0611_1 {
    // 1  2  2  2  2  2  5  6  4
    //2,  2  ,4  ,2  ,5  ,2  ,6  ,2  ,7
    //1  1  1  1  2  2  2  2  2
    public int MoreThanHalfNum_Solution(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            int j = i + 1;
            for (; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    if (count > array.length / 2) {
                        break; //若大于数组长度的一般，就直接跳出循环
                    }
                }
            }
            if (count > array.length / 2 && array.length != 1) {
                return array[j];  //跳出循环的位置就是，次数超过一半的数字
            } else if (array.length == 1) { //特殊情况，数组的大小为1
                return array[0];
            }
        }
        return 0; //没有就返回0
    }
}

