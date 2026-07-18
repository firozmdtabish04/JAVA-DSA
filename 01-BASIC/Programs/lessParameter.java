public class lessParameter {

    public static void main(String[] args) {
        sum(10);
    sum(10,23);
    sum(10,23,34);
    sum(10,23,43,78);
    }

     public static void sum(int... x){
       int total = 0;
       for(int num : x){
        total = total +num;
       }
       System.out.println(total);
    }
    
}
