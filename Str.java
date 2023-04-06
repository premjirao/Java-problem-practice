import java.util.Scanner;
import java.util.function.BooleanSupplier;

import javax.annotation.processing.SupportedOptions;
import javax.swing.plaf.SplitPaneUI;

/*canner s = new Scanner(System.in);
String str;
str = s.next();
System.out.print(str);
Scanner s = new Scanner(System.in);
int a = s.nextInt();
String str = s.next();
System.out.print(a);
System.out.println(str);
Scanner s = new Scanner(System.in);
String str = s.next();
int a = s.nextInt();
System.out.print(str + " " + a);

Scanner s = new Scanner(System.in);
int num = s.nextInt();
int i=2;
while(i<=num/2){
        if(num%i==0)
            System.out.print(i+" ");
        i++;
        }
      import java.util.Scanner;
        class Strings{
         public static void main (String[] args)
         {
        Scanner s = new Scanner(System.in);
          int n = s.nextInt();
          int es=0,os=0;
          while(n>0){
            int digit=n%10;
            n/=10;
            if(digit%2==0){
               es=es+digit;
               }
             else{
               os=os+digit;
              }
            }
           System.out.print(es+" ");
           System.out.print(os); 
    }
   
 }
 import java.util.Scanner;
class Str{
  public static boolean revers(String str){
   // String orginal=str;
    String reversString="";
    boolean ans=false;
    for(int i=0;i<str.length();i++){
      //System.out.println(str.charAt(i));
      reversString =str.charAt(i)+reversString;
    }
    if(str.equals(reversString)){
      ans=true;
    }
    return ans;
    
  }
  public static void main(String[] args){
    
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    //String str="geeks";
   Boolean prem = revers(str);
    System.out.println(prem);
   
  }
 
}*/
//import java.util.Scanner;
class Str{
  public static void main(String[] args){
    //Scanner sc=new Scanner(System.in);
    //int number=sc.nextInt();
    /*int rev=0;
    while(number>0){
      int lastDigit=number%10;
      //System.out.print(lastDigit);
      rev=(rev*10)+lastDigit;
       number=number/10;
    }
    System.out.println(rev);
    do{
      System.out.print("Enter your number:");
      int number=sc.nextInt();
      if(number%10==0){
        continue;

      }
      System.out.println("your number was "+ number);
      
    }while(true);
    int oddsum=0;
    int evensum=0;
    while(number>0){
      int digit=number%10;
      number/=10;
      if(digit%2==0){
        evensum+=digit;
      } else {
        oddsum+=digit;
      }
    }
    System.out.println(evensum);
    System.out.println(oddsum);*/
    int i=1;
    int j=1;
      char ch='A';
      while(i<=4){

        while(j<=i){
          System.out.print(ch);
          j++;
          ch++;
        }
        System.out.println();
           i++;
      }
    
  }
}


