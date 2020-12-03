package bai_2_Array_And_Loop_Java.thuc_hanh_arry;

public class MinValue {
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
    public static int minValue(int[] array){
        int min = array[0];
        int index = 0;
        for (int i = 0; i<array.length;i++){
            if (array[i]<min){
                min = array[i];
                index = i;
            }
        }
        return index;

    }
}
