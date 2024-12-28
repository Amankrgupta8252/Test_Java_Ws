public class java_nestedLoop_10 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = 0; i < 9; i++) {
            for (int k = 0; k < 9 - i; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}



/*


 * 
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  *
 *  *  *  *  *  *
 *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *
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