public class Recursion{

    public static void print1toN(int n){
        if(n==0){
            return;
        }
        print1toN(n-1);
        System.out.println(n);
    }
    public static int sumn(int n){
        if(n==0){
            return 0;
        }
        int smalloutput=sumn(n-1);
        int output=n+smalloutput;
        return output;

    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int prem=fact(n-1);
        int sanjana=n*prem;
        return sanjana;
    }
    public static void main(String[] args){
        print1toN(5);
        System.out.println("The sum of N natural number:"+sumn(10));
        System.out.println("The factorial of N number:"+fact(5));
    }

}