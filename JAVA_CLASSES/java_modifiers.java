public class java_modifiers {
    static void myStaticMethod() {
        System.out.println("Static Method can be called without creating an object");
    }

    public void mypublicStaticMethod() {
        System.out.println("public StaticMethod can be called without creating an object");
    }

    public static void main(String[] args) {
        myStaticMethod();

        java_modifiers myobj = new java_modifiers();
        myobj.mypublicStaticMethod();

    }
}
