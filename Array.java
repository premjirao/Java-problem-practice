//import java.util.Scanner;
public class Array{
     public static void byRefrence(int marks[],int nonchangeble) {
         nonchangeble=39;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        } 
     }    
        public static void main(String args[]){
                int marks[]={23,45,57};
                int nonchangeble=5;
                
                byRefrence(marks,nonchangeble);
                System.out.println(nonchangeble);

                //to print after the refrence
                for(int i=0;i<marks.length;i++) {
                    System.out.print(marks[i]+" ");
                }
        }
    
    }
