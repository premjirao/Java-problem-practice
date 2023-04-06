/*import java.lang.Math; 
import java.util.Scanner;

public class PowerOfx{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
         if(x<=0 || x<=8)
         {
          if(n<=0 || n<=9)
            System.out.println((int)Math.pow(x,n));
         } 
    }
}*/
import java.util.Scanner;
public class PowerOfx {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int i =1;
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
