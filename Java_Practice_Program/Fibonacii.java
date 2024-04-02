public class Fibonacii {
    public static int fib (int a,int b,int n) {
        if(n==0){
            return 1;
        }
        int c=a+b;
        System.out.println(c);
        int res=fib(b,c,n-1);
        return res;
    }
    public static void main(String[] args) {
        
        fib(0,1,7);
    }
}
