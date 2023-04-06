import java.util.Scanner;

//import javax.xml.validation.SchemaFactoryConfigurationError;
public class function{
 public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int nc=s.nextInt();
        int[] arr=new int[n];
        int i,j,sum=0;
        for(i=1;i<=nc;i++){
          
            for(j=i;j<=i;j++){
              arr[j]=s.nextInt();
              //System.out.print(" ");
            }
        }

        for(j=0;j<=arr.length;j++){
           // System.out.println(arr[i]);
                sum+=arr[j];
                    
        }
        System.out.println("the sum of toptal array "+sum);  
    }
 }
