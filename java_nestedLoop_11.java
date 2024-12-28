public class java_nestedLoop_11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("0 ");
            }
            for (int j = 0; j < 10-i; j++) {
                System.out.print("  ");
                
            }
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("0 ");
            }
            System.out.println();
        }
        for (int i = 9; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("0 ");
            }
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 10 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
}


/*


0                                     0 
0 0                                 0 0 
0 0 0                             0 0 0 
0 0 0 0                         0 0 0 0 
0 0 0 0 0                     0 0 0 0 0 
0 0 0 0 0 0                 0 0 0 0 0 0 
0 0 0 0 0 0 0             0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0         0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 0     0 0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 0     0 0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0         0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0             0 0 0 0 0 0 0 
0 0 0 0 0 0                 0 0 0 0 0 0 
0 0 0 0 0                     0 0 0 0 0 
0 0 0 0                         0 0 0 0 
0 0 0                             0 0 0 
0 0                                 0 0 
0                                     0 

 
 */