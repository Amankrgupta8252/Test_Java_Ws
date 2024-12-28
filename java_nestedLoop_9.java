public class java_nestedLoop_9 {
    public static void main(String[] args) {
         for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
               System.out.print("  ");
            }
            for (int k = 0; k < 10 - i; k++) {
                System.out.print(" *  ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *  ");
            }
            System.out.println(); 
        }

    }
}



/*




 *   *   *   *   *   *   *   *   *   *  
   *   *   *   *   *   *   *   *   *  
     *   *   *   *   *   *   *   *  
       *   *   *   *   *   *   *  
         *   *   *   *   *   *  
           *   *   *   *   *  
             *   *   *   *  
               *   *   *  
                 *   *  
                   *  
                   *  
                 *   *  
               *   *   *  
             *   *   *   *  
           *   *   *   *   *  
         *   *   *   *   *   *  
       *   *   *   *   *   *   *  
     *   *   *   *   *   *   *   *  
   *   *   *   *   *   *   *   *   *  
 *   *   *   *   *   *   *   *   *   *  


 
 */