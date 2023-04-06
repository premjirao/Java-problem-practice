import java.util.*;
//import java.util.Collections;
public class LinearS {

    public static int linearSearch(int numbers[],int key){
        //     int largest=Integer.MIN_VALUE;
        //     int smallest=Integer.MAX_VALUE;
        // for(int i=0;i<numbers.length;i++){
        //     if(largest<numbers[i]){
        //         largest=numbers[i];
        //     }
        //     if(smallest>numbers[i]){
        //         smallest=numbers[i];
        //     }
        // }
        // System.out.println("the largest number in array is "+largest);
        // System.out.println("the smallest number in array is "+smallest);
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int num[]={23,345,11,65,34};
        //String kay="subham";
        int key=11;
        System.out.println(key+" number present at index of:"+linearSearch(num, key));
        Arrays.sort(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        //Arrays.sort(num,Collections.reverseOrder());
        
    }
}
