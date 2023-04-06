//import java.util.Scanner;
public class twodarr{
   /* public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of row");
        int rows=s.nextInt();
        System.out.println("enter number of cols");
        int cols=s.nextInt(); 
        int arr[][] = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
            System.out.println("enter the element at "+i+" rowa "+j+" cols");
                 arr[i][j]=s.nextInt();
                }  
            }
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            int[][] arr2d={{1,3,4,2},{4,5,2,1},{2,4,8,9}};
            System.out.println(arr2d.length);
            System.out.println(arr2d[0].length);
           
        }*/
        public static int fun(int[][] arr2d)
{
    int sum=0;
    for(int i=0;i<arr2d.length;i++)
    {
        for(int j=0;j<arr2d[i].length;j++)
        {
            sum+=arr2d[i][j];
        }
    }
    return sum;
}
public static void main(String[] args) 
{ 
    int[][] arr = { {0,1,2,4,5}, {3,4,5,6,7},{5,6,7,8,9} }; 
    System.out.println(fun(arr)); 
        } 
        

}
    
