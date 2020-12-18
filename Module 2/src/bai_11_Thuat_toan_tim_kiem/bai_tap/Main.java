package bai_11_Thuat_toan_tim_kiem.bai_tap;

public class Main {
    public static void main(String[] args) {
        BinarySearch bi = new BinarySearch();
        int array[] = {3, 4, 5, 6, 7, 8, 9 };
        int n = array.length;
        int x = 4;
        int result = bi.binarySearch(array , x , 0 , n-1);
        if (result == -1){
            System.out.println(" not found");
        }else {
            System.out.println("element found at index :" + result);
        }
    }
}
