public class findKey {
    public static void main(String[] args) {
        int a[] = new int[] { 12, 44, 23, 56, 9, 23, 78, 13, 44};
        keyDupFind(a);
        firstKey(a);
    }
    // For Dulicate available in given array 
    public static void keyDupFind(int arr[]) {
        int key = 44;
 
        System.out.println("Key: " + key );
        for(int i =1; i<arr.length; i++){
            if(arr[i] == key){
                System.out.println("Key Found at index " + i  );
               
                
            }
          
        }
    }
    public static void firstKey(int arr[]) {
        int key = 12;
        System.out.println("Key: "+ key);
        for(int i =0; i<arr.length; i++){
            if(arr[i] == key){
                System.out.println("Key Found at index "+ i);
                return;
            }
        }
        System.out.println("Key Not Found");
    }
}
