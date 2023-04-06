import java.util.Scanner;
public class Mirrori{
        public static void main(String[] args){
            Scanner s =  new Scanner(System.in);
            int n = s.nextInt();
            int i=1;
            /* 1 12 123
             while(i<=n){
                int spaces=1;
                while(spaces<=n-i){
                    System.out.print(' ');
                    spaces++;
                 }
                 int p=1;
                 while(p<=i){
                    System.out.print('*');
                    p++;

                 }
                 System.out.println();
                 i++;

            }
             333 22 1
            while(i>=1){
                int j=1;
                while(j<=i){
                    System.out.print(i);
                    j++;
                }
                System.out.println();
                i--;*/
                while(i<=n){
                    int spaces=1;
                    while(spaces<=n-i){
                        System.out.print(' ');
                        spaces++;
                     }
                      int j=1;
                        while(j<=i){
                            System.out.print('*');
                            j++;
                        }
                     int dec=i-1;
                     while(dec>=1){
                        System.out.print('*');
                        dec--;
    
                     }
                     System.out.println();
                     i++;
    
            }
           
        }
    }