public class java_Return {
    public static int A_Return(int a, int b){ // if you are using return thpe then can't use void keyword here
        return a + b;
    }

    public static void main (String[] args) {
        int c = A_Return(8, 10);
        System.out.println(c);
    }
}