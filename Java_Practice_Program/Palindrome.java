import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      
      int r, temp ,sum=0;
      temp=n;
      while(n>0){
        r=n%10;
        sum=(sum*10)+r;
        n=n/10;
      }
      if(temp==sum){
        System.out.println("no is palindrome");
      }
      else{
        System.out.println("No is not palindrome");
      }
    }
}
