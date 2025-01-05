public class java_Inheritance {
    protected String brand = "ford";
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

class car extends java_Inheritance {
    private final String modelName = "Mustang";
    public static void main(String[] args) {
        car myCar = new car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
