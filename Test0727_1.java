package javaDailyProctice.Test0727;

public class Test0727_1 {
   public static void bubbleSort(int[] array) {
        for (int end = array.length; end > 0; end--) {
            boolean sorted = true;
            for (int i = 1; i < end; i++) {
                if (array[i - 1] > array[i]) {
                    Swap(array, i - 1, i);
                    sorted = false;
                }
            }
            if (sorted == true) {
                break;
            }
        }
    }

    private static void Swap(int[] array, int i, int i1) {
       int temp=array[i];
       array[i]=array[i1];
       array[i1]=temp;
    }

    public static void main(String[] args) {
        int[] arr={5,3,7,9,10,77};
         bubbleSort(arr);
    }


}
