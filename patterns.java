import java.util.Scanner;
public class patterns{
    public static void main(String[] args){
    // Scanner s = new Scanner(System.in);
       // int n = s.nextInt();
        
       /*  for(int i=1;i<=n;i++){

            for(int j=i;j>=1;j--){
                 System.out.print((char)65+1);
            
            }
            System.out.println();
            
        }
        Scanner s = new Scanner(System.in);
          int n = s.nextInt();
		for(int i=1;i<=n;i++){
            
            for(int j=i;j<=i;j++){
                System.out.print((char)(64+i));
            }
            System.out.println();
        }
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        while(i<=n){
            char p = (char)('A'+i-1);
            int j=1;
            while(j<=i){
                System.out.print(p);
                p=(char)(p+1);
                j++;

            }
            System.out.println();
            i++;
        }*/
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
       // int num = n ;
      /*   while(i <= n ){

            int  j = 1 ;
            int   Start =  'A'+num-1;    
            while( j<=i ){
                System.out.print((char)(Start));
                j++;
                Start++;
            }
            System.out.println();
            num--;
            i++;
        }*/ while(i<=n){
            int spaces = 1;
            while(spaces<=n-i){
                System.out.print(" ");
                spaces++;
                int p=i;
                int j=1;
                while(j<=i){
                    System.out.print(p+1);
                    p++;
                    p=p-2;
                    int th=1;
                    while(th<=i-1){
                        System.out.print(p-1);
                       th++;
                    }
                    
                }
              
            }
            System.out.println();
            i++;
        }
     }
}