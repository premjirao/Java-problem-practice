public class binarySearch {
    public static int binarySearch(int numbers[],int key){
        int start=0; int end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }
            else{
                start=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={24,34,45,32,56,36,79};
        int key=56;
       System.out.println(binarySearch(numbers, key)); 
    }
    
}
