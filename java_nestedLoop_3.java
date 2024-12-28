public class java_nestedLoop_3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10 - i; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}



/*
 

 *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *
 *  *  *  *  *  *
 *  *  *  *  *
 *  *  *  *
 *  *  *
 *  *
 *


 */