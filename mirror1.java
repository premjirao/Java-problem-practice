import java.util.Scanner;
class mirror1{
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int space=1;
            while(space<=n-i){
                System.out.print(" ");
                space++;
            }
            int star=1;
            while(star<=i){
             System.out.print("*") ;
               star++;
            }
           System.out.println();
            i++;
        }
    }
}