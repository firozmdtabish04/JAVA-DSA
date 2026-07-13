
public class triangle {

    static int triangle(int n){

    for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        return n;
    }
    public static void main(String[] args){ 
    triangle(5);
    }
}
