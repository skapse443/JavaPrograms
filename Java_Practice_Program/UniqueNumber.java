import java.io.*;   
import java .util.*;   
public class UniqueNumber {
    public static void main (String[] args)    
    {   
          
        int arrDupli[] = { 10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6 };  
                
        Arrays.sort(arrDupli);         
       
        int len = arrDupli.length;  
             
        int[] distinctArray = new int[20];  
          
        int index = 0;  

        for(int i = 0; i < len; i++){   
             while (i < len - 1 && arrDupli[i] == arrDupli[i + 1])   
                i++;   
            distinctArray[index] = arrDupli[i];  
            index++;  
        }  
            
        for(int i = 0; i < index; i++)  
            System.out.print( distinctArray[i] + " ");   
    }         
      
}   