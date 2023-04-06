public class maxSubArrS { 
    public static void maxsubAS(int arr[]){
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length;j++){
                int end=j;
                currentSum=0;
                for(int k=i;k<=end;k++){

                    currentSum += arr[k];
                }
                System.out.println(currentSum);
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
                
            }
        }
        System.out.println("the max sum array is:"+maxSum);
    }
    public static void main(String args[]) {
        
        int arr[]={2, 4, 6, 8, 10};
        maxsubAS(arr);
    }
    
}
