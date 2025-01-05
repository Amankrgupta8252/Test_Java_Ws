class outerClass{
    int x = 10;

    class innerClass {
        int y = 20;
    }
}

public class java_innerClass {

    public static void main(String[] args) {
        outerClass myOuter = new outerClass();
        outerClass.innerClass myInner = myOuter.new innerClass();
        System.out.println(myInner.y+"\n"+myOuter.x); 
    }
}
