import java.util.Scanner;
public class nCr {
    public static void binomial(int n,int r){
       int  factN=1;
        for(int i=1;i<=n;i++){
            factN=factN*i;
        }
       int factR=1;
       for(int i=1;i<=r;i++){
            factR=factR*i;
       }  
       int factNR=1;
       for(int i=1;i<=n-r;i++){
        factNR=factNR*i;
       }
       int result=factN/(factR*factNR);
       System.out.println(result);

    }
     public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n;
        int r;
        n = sc.nextInt();
        r = sc.nextInt();
        binomial(n,r);
        
    }
    
}
