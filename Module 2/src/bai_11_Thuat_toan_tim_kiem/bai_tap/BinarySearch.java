package bai_11_Thuat_toan_tim_kiem.bai_tap;

public class BinarySearch {
    int binarySearch(int[] array, int x, int low, int high) {
        if (high >= low){
            int mid = (high + low)/2;
            if (array[mid] == x){
                return mid;
            }else if (array[mid] > x){
                return binarySearch(array , low , mid -1 ,x);
            }else {
                return binarySearch(array , high , mid +1, x);
            }
        }
        return -1;
    }

}
