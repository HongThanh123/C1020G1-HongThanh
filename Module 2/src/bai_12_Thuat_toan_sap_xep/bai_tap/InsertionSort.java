package bai_12_Thuat_toan_sap_xep.bai_tap;

public class InsertionSort {
    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length; i++){
            int currentElement = list[i];
            int k;
            for(k = i - 1; k >=0 && list[k] > currentElement; k--){
                list[k+1] = list[k];
            }
            list[k+1] = currentElement;
        }
        }

    public static void main(String[] args) {
        int[] arr = {20,7,5,10,-1,4,2,15,17};
        insertionSort(arr);
        for (int element : arr){
            System.out.print(element+"\t");
        }

    }

}
