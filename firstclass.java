import java.util.Scanner;

 public class firstclass{
  
    public static void main( String args[]){
      /*double doubleVar = 65;
      float floatVar = (float) doubleVar;
      long longVar = (long) floatVar;
      int intVar = (int) longVar;
      short shortVar = (short) intVar;
      //char charvar = intVar;
      byte byteVar = (byte) shortVar;
      System.out.println(intVar);
      int x = 5; 
      if (x < 6)
          System.out.print("Hello  ");
      if(x == 5){
          System.out.print("Hi  ");
      }     
      else{ 
          System.out.print("Hey ");


    }
    int x = 15;
    if(x <= 15){
        System.out.print("Inside if  ");
    }else if(x == 15){
        System.out.print("Inside else if  ");
    }
    System.out.println(x);
    int var1 = 5; 
    int var2 = 6;
    if ((var2 = 1) == var1)
        System.out.print(var2);
    else 
        System.out.print(var2 + 1);*/
       // int a=50;
   // int b=Integer.MIN_VALUE;
     Scanner s = new Scanner(System.in);
     int n =s. nextInt();
   int i,j;  
   int space=0;  
   for(i=0;i<n;i++){// this loop is used to print lines  
       for(j=1;j<=space;j++){// this loop is used to print space in a line  
           System.out.print(" ");  
       }  
       for(j=1;j<=n;j++){// this loop is used to print numbers in a line  
           if(j<=(n-i))  
           System.out.print(j);  
           else  
           System.out.print("*");  
       }  
       j--;  
       while(j>0){// this loop is used to print numbers in a line  
           if(j>n-i)  
           System.out.print("*");  
           else  
           System.out.print(j);  
           j--;  
       }  
       if((n-i)>9)// this loop is used to increment space  
       space=space+1;  
   System.out.println("");
    }
}
}