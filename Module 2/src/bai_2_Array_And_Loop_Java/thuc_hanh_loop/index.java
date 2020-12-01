package bai_2_Array_And_Loop_Java.thuc_hanh;

public class index {
    public static void main(String[] args) {
        int[] x = {3,5,6,9};
        int a = 0, b = 0;
        for(int y : x){
            if(y % 2 != 0)
            {
                a+=y;
                b++;
            }
        }
    }
}
