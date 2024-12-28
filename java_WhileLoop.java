public class java_WhileLoop {
    public static void main(String[] args) {
      int i = 0;
      while(i < 5){
        System.out.println(i);
        i++;
      }

      int j = 1;

      while (j <= 6) {
        if (j < 6) {
          System.out.println("No Yatzy.");
        } else {
          System.out.println("Yatzy!");
        }
        j = j + 1;
      }
    }
}
