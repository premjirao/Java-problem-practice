import java.util.Scanner;
public class Srecursion{
public static void print(int j) {
    if(j==1){
        System.out.print(j+" ");
        return;
    }
    print(j-1);
    System.out.print(j+" ");
}
    public static int fib(int n) {
        if(n==1 || n==2){
            return 1;
        }
        int fib_n_1=fib(n-1);
        int fib_n_2=fib(n-2);
        int output= fib_n_1+fib_n_2;
        //System.out.println();
        return output;
    }
    public static int sum(int start,int end){
        if(end>start){
            return end +sum(start, end-1);
        }
        else{
            return end;
        }
    }
    public static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        int prem=fact(n-1);
        int rao=n*prem;
        return rao;
    }
    public static int xtothepn(int x,int n){
        if(n==0){  // this is base case one
            return 1;
        }
        if(x==0){  // this is base case two
            return 0;
        }
        int xtothep=xtothepn(x,n-1);
        int prem=x*xtothep;
        return prem;
    }
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int j=s.nextInt();
    print(j);
    System.out.println(fib(5)); 
    int result=sum(2, 5);
    System.out.println(result);
     int answer=fact(5);
     System.out.println(answer);
     int x=xtothepn(5, 3);
     System.out.println(x);
    }

}