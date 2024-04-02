import java.util.*;
public class SortingArray {
    public static void main(String[] args) {
        int arr[]={5,2,7,4,8,9};
        int n =arr.length;
        Arrays.sort(arr);
       
        for(int i=0;i<n/2;i++){
            System.out.println(arr[i]+ "");
        }
        for(int j=n-1;j>=n/2;j--){
            System.out.println(arr[j]+"");
        }

    }
}
