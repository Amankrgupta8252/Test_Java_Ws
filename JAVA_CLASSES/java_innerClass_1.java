class OuterClass {
    int x = 10;

    class InnerClass {
        public void display() {
            System.out.println("Value of x is " + x);
        }
    }

    class InnerClass2 extends InnerClass {
        public int Innermethod() {
            return x;
        }
    }
}

public class java_innerClass_1 {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass2 myInner = myOuter.new InnerClass2();
        System.out.println(myInner.Innermethod());
        myInner.display();
    }
}