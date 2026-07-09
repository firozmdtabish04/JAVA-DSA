import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i =1;
        System.out.print("Table: ");
        int num = sc.nextInt();
        
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(num + " x " + i + " = " + num * i);
        // }

        // int i =1;
        // while(i<=10){
        //     System.out.println(num + " x " + i + " = " + num*i);
        //     i++;
        // }

        do{
            System.out.println(num + " x " + i + " = " + num*i);
            i++;
        }while(i<=10);

        sc.close();
    }
}