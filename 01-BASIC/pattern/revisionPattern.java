public class revisionPattern {
    
    public static void main(String[] args) {
        int n =5;
        int m =3;

        // Square Print
        /*
        * * * *
        * * * *
        * * * *
        * * * *
        */ 
        // for(int i =0; i<n; i++){
        //     for(int j =0; j<n; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Right Angle triangle
        /*
+ 
+ + 
+ + + 
+ + + +
        */ 
        // for(int i =n-1; i>0; i--){
        //     for (int j =i; j<n; j++){
        //         System.out.print("+ ");
        //     }
        //     System.out.println();
        // }

        //Inverted Right Angle triangle
        /*
* * * * 
* * * 
* * 
* 
        */ 
        // for(int i =0; i<n; i++){
        //     for(int j =i; j<n; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Rectangle Pattern
        /*
* * * 
* * *
        */ 
        // for(int i =0; i<n; i++){
        //     for (int j =0; j<m; j++){
        //         System.out.print("* ");
        //     } 
        //     System.out.println();
        // }

        // Hollow Rectangle
        /*
*****
*   *
*   *
*   *
*****
        */ 
        // for(int i =0; i<n; i++){ 
        //     for(int j =0; j<m; j++){
        //         if(i==0 || i==n-1 || j==0 || j==m-1){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // vertical Pyramid
        /*
# 
# # 
# # # 
# # # # 
* * * * * 
* * * * 
* * * 
* * 
* 
        */ 
        // for(int i =n-1; i>0; i--){
        //     for(int j=i; j<n; j++){
        //         System.out.print("# ");
        //     }
        //     System.out.println();
        // }
        // for(int i=0; i<n; i++){
        //     for(int j=i; j<n; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
    // 

    // Decreasing Number Pattern
/*
1 1 1 1 
2 2 2 
3 3 
4 
    */ 
    // for (int i=1; i<n; i++){
    //     for (int j =1; j<n-i+1; j++){
    //         System.out.print(i + " ");
    //     }
    //     System.out.println();
    // }

    // increasing Number Pattern
/*
1 
2 2 
3 3 3 
4 4 4 4 
    */ 
    // for(int i=0; i<n; i++){
    //     for(int j=0; j<i; j++){
    //         System.out.print(i + " ");
    //     }
    //     System.out.println();
    // }

    // Number Increasing Pyramid
/*

0 
0 1 
0 1 2 
0 1 2 3 
*/     
//    for(int i =0; i<n; i++){
//         for(int j =0; j<i; j++){
//                 System.out.print(j + " ");
//         }
//         System.out.println();
//    }



}
}
