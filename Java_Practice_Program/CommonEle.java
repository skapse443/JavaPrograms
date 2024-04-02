
import java.util.HashMap;
public class CommonEle {
    public static void main(String[] args)
    {
        int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int[] arr2 = new int[] { 1, 3, 4, 5, 6, 9, 8 };
        findCommonElements(arr1, arr2);
    
    }
 
    public static void findCommonElements(int arr1[],int arr2[])
    {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (hashMap.containsKey(arr1[i])) {
                hashMap.put(arr1[i],hashMap.get(arr1[i]) + 1);
            }
            else {
                hashMap.put(arr1[i], 1);
            }
        }
 
        for (int i = 0; i < arr2.length; i++) {
            if (hashMap.containsKey(arr2[i])) {
               hashMap.remove(arr2[i]);
                System.out.print(arr2[i] + " ");
            }
        }
    }
}
    
