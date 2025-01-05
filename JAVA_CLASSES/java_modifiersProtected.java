public class java_modifiersProtected {
    protected String fname = "Aman";
    protected String lname = "Gupta";
    protected String email = "kramangupta8552@gmail.com";
    protected int age = 18;
}

class Protected extends java_modifiersProtected {
    private final int graduationYear = 2022;

    public static void main(String[] args) {
        Protected myObj = new Protected();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
    }
}
