public class java_nestedLoop_4 {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
            System.out.print("* ");
            for (int k = 0; k < 10 -2; k++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println();

        }
    }
}


/*
 

* * * * * * * * * * 
*                 *
* * * * * * * * * *
*                 *
* * * * * * * * * *
*                 *
* * * * * * * * * *
*                 *
* * * * * * * * * *
*                 *
* * * * * * * * * *
*                 *
* * * * * * * * * *
*                 *
* * * * * * * * * *
*                 *


 */