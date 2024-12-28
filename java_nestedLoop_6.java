public class java_nestedLoop_6 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        
        /*
         
0
01
012
0123
01234
012345
0123456
01234567
012345678
0123456789

         */


        for (int i = 0; i < 6; i++) {
            for (int j = i; j <= i*2; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        /*


0
12
234
3456
45678
5678910
         
         */
    }
}
