
public class largesrInArray {
    public static void main(String[] args) {
        int arr[] = new int[] { 12, 44,100, 123, 56, 9, 23, 78, 13,99 };
        int max = arr[0];
        int index = 0;

        // int a[] = new int[] {};
        if (arr.length == 0) {
            System.out.println("Out of bound");
            return;
        }    
        largestNum(max,arr);
    
    }
    

    public static void largestNum(int max, int[] arr){
        
        int idx =0;
        for(int i = 0; i<arr.length; i++){
          
            if(max<arr[i]){
                max=arr[i];
                idx++;
         
            }
           
        }
        
        System.out.println(max + " "+ idx);
        
    }
}
