import java.util.*;

public class arr {
    public static void main(String[] args){
        int[] arr={1,5,9,21,63};
        for(int i=0;i<arr.length-1;i++){
            if (arr[i]<arr[i+1]){
                // System.out.println("\nnext iteration\n");
            }
            else{
                System.out.println("not and sorted array");
                return;
            }
        }
        System.out.println("given array is a sorted array");
    }

}
