public class java_nestedForLoop {
    public static void main(String[] args) {
        // print zero to nine/

        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                if (i == 0 || j == 0 || i == 7 || j == 7 || i == 7 - j) {
                    System.out.print(" 0");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        int rows = 8; 

        for (int i = 1; i <= rows; i++) {
            if (i == 1 || i == rows) {
                for (int j = 1; j <= 3; j++) {
                    if(j == 1){
                        System.out.print("  ");
                    }
                    if(j== 3||j==8){
                        System.out.print(" 1");

                    }
                }
                System.out.println();
            } else if (i == 2) {
                System.out.println("1  1");
            } else {
                System.out.println("   1");
            }
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i <= 7 ; i++) {
            for (int j = 0; j <= 7; j++) {
                if (i == 0 || i == 7) {
                    System.out.print(" 2");
                } else if (i == 7 - j) {
                    System.out.print("  2");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 8; j++) {
                if ( i == 0 || j == 8 || i == 4 || i == 8) {
                    System.out.print(" 3");
            
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();



        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 7|| i == 7 || j ==8-i){
                    System.out.print(" 4");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 1|| i == 4 || i == 7 ||(j == 1 && i <=4) || (j == 5 && i >= 4)) {
                    System.out.print(" 5");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 8; j++) {
                if (i == 0 || j ==0 || i == 4 || i == 8 ||(j == 8 && i >= 4)) {
                    System.out.print(" 6");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                if (i == 0 || j == 7 - i || i == 4) {
                    System.out.print(" 7");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 8; j++) {
                if (i == 0 || j == 0 || i == 8 || i == 4 || j == 8) {
                    System.out.print(" 8");
                
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                if (i == 0 || (j == 0 && i <= 3) || i == 3 || j == 7 || i == 7) {
                    System.out.print(" 9");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}





/*


 0 0 0 0 0 0 0 0
 0           0 0
 0         0   0
 0       0     0
 0     0       0
 0   0         0
 0 0           0
 0 0 0 0 0 0 0 0


   1
1  1
   1
   1
   1
   1
   1
   1


 2 2 2 2 2 2 2 2
              2
            2
          2
        2
      2
    2
 2 2 2 2 2 2 2 2


 3 3 3 3 3 3 3 3 3
                 3
                 3
                 3
 3 3 3 3 3 3 3 3 3
                 3
                 3
                 3
 3 3 3 3 3 3 3 3 3


             4
           4 4
         4   4
       4     4
     4       4
   4         4
 4 4 4 4 4 4 4 4 4
             4
             4


 5 5 5 5 5 5 5
 5
 5
 5 5 5 5 5 5 5
             5
             5
 5 5 5 5 5 5 5


 6 6 6 6 6 6 6 6 6
 6
 6
 6
 6 6 6 6 6 6 6 6 6
 6               6
 6               6
 6               6
 6 6 6 6 6 6 6 6 6


 7 7 7 7 7 7 7 7
             7
           7
         7
 7 7 7 7 7 7 7 7
     7
   7
 7


 8 8 8 8 8 8 8 8 8
 8               8
 8               8
 8               8
 8 8 8 8 8 8 8 8 8
 8               8
 8               8
 8               8
 8 8 8 8 8 8 8 8 8


 9 9 9 9 9 9 9 9
 9             9
 9             9
 9 9 9 9 9 9 9 9
               9
               9
               9
 9 9 9 9 9 9 9 9

 
 */